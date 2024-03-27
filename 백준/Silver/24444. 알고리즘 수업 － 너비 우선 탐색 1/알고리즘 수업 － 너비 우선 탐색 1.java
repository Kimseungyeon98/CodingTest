import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int node,connection,start,cnt;
	static ArrayList<ArrayList<Integer>> nodes;
	static boolean[] visited;
	static Queue<Integer> q;
	static int[] rank;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		node = Integer.parseInt(st.nextToken());
		connection = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		nodes = new ArrayList<>();
		visited = new boolean[node+1];
		q = new LinkedList<>();
		rank = new int[node+1];
		cnt = 1;
		
		for(int i=0; i<node+1 ; i++) {
			nodes.add(new ArrayList<>());
		}
		
		
		for(int i=0; i<connection ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			nodes.get(a).add(b);
			nodes.get(b).add(a);
		}
		
		
		for(int i=0; i<nodes.size(); i++) {
			Collections.sort(nodes.get(i));
		}
		
		
		bfs(start);
		
		
		for(int i=1; i<rank.length ; i++) {
			System.out.println(rank[i]);
		}
		
		
		br.close();
	}
	
	public static void bfs(int start) {
		visited[start] = true;
		rank[start] = cnt++;
		q.add(start);
		
		while(!q.isEmpty()) {
			int current = q.poll();
			for(int i=0; i<nodes.get(current).size() ; i++) {
				int x = nodes.get(current).get(i);
				if(!visited[x]) {
					visited[x] = true;
					rank[x] = cnt++;
					q.add(x);
				}
			}
		}
	}
}