import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int cnt;
	static int xMax,yMax,n;
	static boolean[][] visited;
	static int[] dx = {0,-1,0,1};
	static int[] dy = {1,0,-1,0};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<t ; i++) {
			st = new StringTokenizer(br.readLine());
			// 가로 최대 길이
			xMax = Integer.parseInt(st.nextToken());
			// 세로 최대 길이
			yMax = Integer.parseInt(st.nextToken());
			// 썩은 배추의 수
			n = Integer.parseInt(st.nextToken());
			// 썩은 배추 지도
			arr = new int[yMax][xMax];
			// 지렁이 수
			cnt = 0;
			//방문여부
			visited = new boolean[yMax][xMax];
			
			// 지도에 썩은 배추 위치 넣기
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				arr[b][a] = 1;
			}
			
			// 배추 순찰
			for (int y = 0; y < yMax; y++) {
				for (int x = 0; x < xMax; x++) {
					if(arr[y][x]==1 && !visited[y][x]) {
						dfs(x,y);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	
	static void dfs(int x, int y) {
		visited[y][x] = true;
		for(int i=0; i<4 ; i++) {
			int move_x = x + dx[i];
			int move_y = y + dy[i];
			if(move_x >= 0 && move_y >= 0 && move_x < xMax && move_y < yMax) {
				if (!visited[move_y][move_x] && arr[move_y][move_x] == 1) {
					dfs(move_x, move_y);
				}
			}
		}
	}
}