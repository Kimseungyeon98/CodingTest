import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int node,connection,start,rank;
	static boolean[] visited;
	static List<Integer>[] nodes;
	static int[] ranks;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		//노드의 수
		node = Integer.parseInt(st.nextToken());
		//간선의 수
		connection = Integer.parseInt(st.nextToken());
		//시작노드
		start = Integer.parseInt(st.nextToken());
		//노드방문여부
		visited = new boolean[node+1];
		//연결기록
		nodes = new List[node+1];
		
		ranks = new int[node+1];
		rank=1;
		
		for(int i=0; i<node+1; i++) {
			nodes[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<connection; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			nodes[a].add(b);
			nodes[b].add(a);
		}
		
		//오름차순으로
		for(List<Integer> l : nodes) {
			Collections.sort(l,new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2-o1;
				}
			});
		}
		
		dfs(start);
		
		for(int i=1; i<node+1 ; i++) {
			System.out.println(ranks[i]);
		}
	}
	
	public static void dfs(int start) {
		if(!visited[start]) {
			visited[start]=true;
			ranks[start] = rank++;
			for(int i=0; i<nodes[start].size(); i++) {
				dfs(nodes[start].get(i));
			}
		}
	}
}