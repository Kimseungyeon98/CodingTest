import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visit;
	static int[] arr;
	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			arr = new int[101];
			visit = new boolean[101];
			
			for(int i=0; i<n+m; i++) {
				st = new StringTokenizer(br.readLine());
				arr[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
			}
			
			bfs(1);
	}
	static void bfs(int start) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(start,0));
		visit[start] = true;
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			
			if(cur.stage==100) {
				System.out.println(cur.value);
				return;
			}
			
			for(int i=1; i<7; i++) {
				int next = cur.stage + i;
				if(next<=100) {
					if(arr[next]!=0) {
						next = arr[next];
					}
					if(!visit[next]) {
						visit[next] = true;
						q.add(new Node(next, cur.value+1));
					}
				}
				
			}
		}	
	}
}

class Node{
	int stage, value;
	
	Node(int stage, int value){
		this.stage = stage;
		this.value = value;
	}
}