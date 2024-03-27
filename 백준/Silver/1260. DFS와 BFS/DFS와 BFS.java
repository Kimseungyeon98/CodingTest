import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int node,connection,start,cnt;
	static List<List<Integer>> nodes;
	static boolean[] visited;
	static int[] order;
	static Queue<Integer> q;
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//초기화 작업
		st = new StringTokenizer(br.readLine());
		node = Integer.parseInt(st.nextToken());
		connection = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		cnt = 1;
		nodes = new ArrayList<List<Integer>>();
		
		visited = new boolean[node+1];
		order = new int[node+1];
		for(int i=0; i<node+1 ; i++) {
			nodes.add(new ArrayList<Integer>(0));
		}
		q = new LinkedList<>();
		
		//노드 움직임 담기
		for(int i=0; i<connection ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			nodes.get(a).add(b);
			nodes.get(b).add(a);
		}
		
		//정렬
		for(int i=0; i<nodes.size(); i++) {
			Collections.sort(nodes.get(i));
		}
		
		//DFS
		dfs(start);
		for(int i=1; i<=node ; i++) {
			for(int j=0; j<order.length ; j++) {
				if(order[j] == i) {
					System.out.print(j+" ");
				}
			}
		}
		System.out.println("");
		
		//초기화
		order = new int[node+1];
		visited = new boolean[node+1];
		cnt = 1;
		
		//BFS
		bfs(start);
		for(int i=1; i<=node ; i++) {
			for(int j=0; j<order.length ; j++) {
				if(order[j] == i) {
					System.out.print(j+" ");
				}
			}
		}
	}
	
	static void dfs(int node) {
		if(!visited[node]) {
			visited[node] = true;
			order[node] = cnt++;
			for(int i=0; i<nodes.get(node).size(); i++) {
				dfs(nodes.get(node).get(i));
			}
		}
	}
	
	static void bfs(int node) {
		q.add(node);
		while(!q.isEmpty()) {
			int current = q.poll();
			if(!visited[current]) {
				order[current]=cnt++;
				visited[current] = true;
				for(int i=0; i<nodes.get(current).size() ; i++) {
					q.add(nodes.get(current).get(i));
				}
			}
		}
	}
}