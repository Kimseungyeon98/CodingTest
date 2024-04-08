import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] map,dp;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};
	static boolean[][] visit;
	static int startX,startY,maxX,maxY;
	static Queue<Integer> q;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		maxY = Integer.parseInt(st.nextToken());
		maxX = Integer.parseInt(st.nextToken());
		
		// 지도
		map = new int[maxY][maxX];
		// 결과값
		dp = new int[maxY][maxX];
		// 지도 방문 여부
		visit = new boolean[maxY][maxX];
		// 좌표 넣을 큐
		q = new LinkedList<>();
		
		for(int i=0; i<maxY; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<maxX; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j]==2) {
					startX = j;
					startY = i;
					q.offer(startX);
					q.offer(startY);
				}
			}
		}

		bfs();
		dp[startY][startX] = 0;
		for(int i=0; i<maxY; i++) {
			for(int j=0; j<maxX; j++) {
				//갈 수 없는 땅이 아닌데 방문한적 없다면 길이 막혀 갈 수 없는 땅
				if(map[i][j]!=0 && !visit[i][j]) {
					sb.append("-1 ");
					} else {
						sb.append(dp[i][j]+" ");
					}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
	
	
	static void bfs() {
		while(!q.isEmpty()) {
			int x = q.poll();
			int y = q.poll();
			for(int i=0; i<4; i++) {
				int cx = x + dx[i];
				int cy = y + dy[i];
				// 1. 지도 밖을 벗어나거나
				if(cx<0 || cy<0 || cx>=maxX || cy>=maxY) continue;
				// 2. 지도상에서 갈 수 없는 위치거나
				if(map[cy][cx]==0) continue;
				// 3. 방문한 적 있거나
				if(visit[cy][cx]) continue;
				
				visit[cy][cx] = true;
				dp[cy][cx] = dp[y][x] + 1;
				q.offer(cx);
				q.offer(cy);
			}
		}
	}
}