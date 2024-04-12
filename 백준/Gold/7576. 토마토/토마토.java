import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int r,c;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		//가로
		int m = Integer.parseInt(st.nextToken());
		//세로
		int n = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		boolean[][] visit = new boolean[n][m];
		
		int depth = 0;
		
		int[] dx = {1,-1,0,0};
		int[] dy = {0,0,1,-1};
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j]==1) {
					q.add(j);
					q.add(i);
					visit[i][j] = true;
				}
			}
		}
		
		
		while(!q.isEmpty()) {
			depth++;
			int size = q.size()/2;
			for(int i=0; i<size; i++) {
				int x = q.poll();
				int y = q.poll();
				for (int j = 0; j < 4; j++) {
					int cx = x + dx[j];
					int cy = y + dy[j];
					if(cx<0||cx>=m||cy<0||cy>=n) continue;
					if(!visit[cy][cx]&&arr[cy][cx]!=-1) {
						q.add(cx);
						q.add(cy);
						visit[cy][cx]=true;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for (int j = 0; j <m ; j++) {
				if(arr[i][j]!=-1&&!visit[i][j]) {
					System.out.println("-1");
					return;
				}
			}
		}
		System.out.println(depth-1);
		br.close();
	}
}