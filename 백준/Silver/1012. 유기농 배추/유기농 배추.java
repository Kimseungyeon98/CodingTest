import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int cnt;
	static int xMax,yMax,n;
	static boolean[][] visit;
	static int[] dx = {0,-1,0,1};
	static int[] dy = {1,0,-1,0};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		for(int i=0; i<t ; i++) {
			st = new StringTokenizer(br.readLine());
			// 가로 길이
			xMax = Integer.parseInt(st.nextToken());
			// 세로 길이
			yMax = Integer.parseInt(st.nextToken());
			// 썩은 배추의 수
			n = Integer.parseInt(st.nextToken());
			// 썩은 배추 지도
			arr = new int[yMax][xMax];
			// 지렁이 수
			cnt = 0;
			//방문여부
			visit = new boolean[yMax][xMax];
			
			// 지도에 썩은 배추 위치 넣기
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				arr[b][a] = 1;
			}
			
			// 배추 순찰
			for (int j = 0; j < yMax; j++) {
				for (int k = 0; k < xMax; k++) {
					if(arr[j][k]==1 && !visit[j][k]) {
						dfs(k,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	
	
	static void dfs(int x, int y) {
		visit[y][x] = true;
		
		for(int i=0; i<4 ; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];
			if(cx >= 0 && cy >= 0 && cx < xMax && cy < yMax) {
				if (!visit[cy][cx] && arr[cy][cx] == 1) {
					dfs(cx, cy);
				}
			}
		}
	}
}