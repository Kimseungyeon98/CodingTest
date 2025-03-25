import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] parent = new int[n+1];
		
		boolean[] visited = new boolean[n+1];
		
		ArrayList<Integer>[] arr = new ArrayList[n+1];
		for(int i=0; i<n+1; i++) {
			arr[i] = new ArrayList<>();
		}
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<n-1; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[p].add(c);
			arr[c].add(p);
		}
		
		q.add(1);
		visited[1] = true;
		
		while(!q.isEmpty()) {
			int current = q.poll();
			for(int next : arr[current]) {
				if(visited[next]) {
					continue;
				}
				visited[next] = true;
				parent[next] = current;
				q.add(next);
			}
		}
		
		for(int i=2; i<=n; i++) {
			System.out.println(parent[i]);
		}
	}
}