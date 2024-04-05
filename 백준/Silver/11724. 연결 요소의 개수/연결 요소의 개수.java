import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visit;
	static int[][] nodes;
	static int node,connection;
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		node = Integer.parseInt(st.nextToken());
		connection = Integer.parseInt(st.nextToken());
		
		visit = new boolean[node+1];
		nodes = new int[node+1][node+1];
		int cnt = 0;
		visit[0] = true;
		
		for(int i=0; i<connection; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			nodes[a][b] = 1;
			nodes[b][a] = 1;
		}
		
		for(int i=1; i<node+1; i++) {
			if(!visit[i]) {
				cnt++;
			}
			dfs(i);
		}

		System.out.println(cnt);
		br.close();
	}
	
	static void dfs(int start) {
		if(!visit[start]) {
			visit[start] = true;
			for(int i=1; i<node+1; i++) {
				if(nodes[start][i]==1) {
					dfs(i);
				}
			}
		}
	}
}