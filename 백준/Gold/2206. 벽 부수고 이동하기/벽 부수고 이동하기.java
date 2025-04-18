import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;
public class Main{
	
	static int[][] map;
	static boolean[][][] visited;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,-1,1};
	
	static int n,m;
	
	static List<Integer> list;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		visited = new boolean[n][m][2];
		
		list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			/*
			 * for(int j=0; j<m; j++) { map[i][j] = Integer.parseInt(st.nextToken()); }
			 */
			map[i] = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
		}
		
		/*
		 * visited[0][0] = true; dfs(0,0,false,0);
		 * 
		 * if(list.size()==0) { System.out.println(-1); return; }
		 * System.out.println(list.stream().mapToInt(v -> v).min().getAsInt()+1);
		 */
		
		bfs();
		
	}
	
	/*
	 * static void dfs(int y, int x, boolean wallBreak, int score) { // dfs(최단거리찾기)
	 * // 벽 부순적이 있는지 확인 // n,m까지 이동했다면 몇번 움직였는지 if(y==n-1 && x==m-1) {
	 * list.add(score); return; }
	 * 
	 * 
	 * for(int i=0; i<4; i++) { int ny = y+dy[i]; int nx = x+dx[i];
	 * 
	 * 
	 * if(ny<0 || ny>=n || nx<0 || nx>=m) continue; if(visited[ny][nx]) continue;
	 * 
	 * 
	 * visited[ny][nx] = true; if(map[ny][nx]==0) { dfs(ny, nx,wallBreak, score+1);
	 * } else { if(!wallBreak) dfs(ny,nx,true, score+1); } visited[ny][nx] = false;
	 * } }
	 */
	
	static void bfs() {
		
		Queue<Node> queue = new LinkedList<>();
		// 0 0 false 0
		queue.add(new Node(0,0,false,0));
		visited[0][0][0] = true;
		list = new ArrayList<>();
		
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			int y = node.y;
			int x = node.x;
			boolean wallBreak = node.wallBreak;
			int score = node.score;
			
			if(y==n-1 && x==m-1) {
				list.add(score);
				continue;
			}
			
			for(int i=0; i<4; i++) {
				int ny = y+dy[i];
				int nx = x+dx[i];
				int broken = wallBreak?1:0;
				
				if(ny<0 || ny>=n || nx<0 || nx>=m) continue;
				
				if (map[ny][nx] == 0 && !visited[ny][nx][broken]) {
	                visited[ny][nx][broken] = true;
	                queue.add(new Node(ny, nx, wallBreak, score + 1));
	            }

	            else if (map[ny][nx] == 1 && !wallBreak && !visited[ny][nx][1]) {
	                // 벽을 아직 안 부쉈고, 벽인 경우 부수고 감
	                visited[ny][nx][1] = true;
	                queue.add(new Node(ny, nx, true, score + 1));
	            }
			}
		}
		if(list.size()==0) {
			System.out.println(-1);
			return;
		}
		System.out.println(list.stream().mapToInt(v -> v).min().getAsInt()+1);
	}
}
class Node {
	int y,x;
	boolean wallBreak;
	int score;
	
	Node(int y, int x, boolean wallBreak, int score){
		this.y = y;
		this.x = x;
		this.wallBreak = wallBreak;
		this.score = score;
	}
}