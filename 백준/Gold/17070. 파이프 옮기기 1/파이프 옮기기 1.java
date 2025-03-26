import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 새 집 크기는 n*n
		// 각각의 칸은 (r,c)
		// r -> 행의 번호
		// c -> 열의 번호
		// 미는 방향은 3시 5시 6시
		// 초기 파이프 (1,1) (1,2) 방향은 가로
		// 파이프의 한쪽 끝을 (n,n) 으로 이동 시키는 방법의 개수
		// 빈 칸은 0, 벽은 1
		// (1,1)과 (1,2)는 항상 빈 칸
		// 이동시킬 수 없는 경우에는 0을 출력
		int result = 0;
		int n = Integer.parseInt(br.readLine());

		int[][] map = new int[n][n];
		//boolean[][][] visited = new boolean[n][n][3];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		if(map[n-1][n-1]==1) {
			System.out.println(0);
			return;
		}
		
		Queue<Pipe> q = new LinkedList<>();
		q.add(new Pipe(1,0,1));
		//visited[0][1][1] = true;
		
		int x,y,d;
		while(!q.isEmpty()) {
			Pipe current = q.poll();
			
			x = current.x;
			y = current.y;
			d = current.d;
			
			if(x+1==n && y+1==n) {
				result++;
				continue;
			}
			
			//if(x+1>=n||y+1>=n) continue;
			
			//if(visited[current.y][current.x][current.d]) continue;
			
			if(d==1 && x+1<n) {
				// 오른쪽으로 이동
				if(map[y][x+1]!=1) {
					q.add(new Pipe(x+1,y,1));
				}
				// 대각선으로 이동
				if(y+1<n && map[y+1][x+1]!=1 && map[y+1][x]!=1 && map[y][x+1]!=1) {
					q.add(new Pipe(x+1,y+1,2));
				}
			} else if(d==2) {
				// 오른쪽으로 이동
				if(x+1<n && map[y][x+1]!=1) {
					q.add(new Pipe(x+1,y,1));
				}
				// 대각선으로 이동
				if(x+1<n && y+1<n && map[y+1][x+1]!=1 && map[y+1][x]!=1 && map[y][x+1]!=1) {
					q.add(new Pipe(x+1,y+1,2));
				}
				// 아래로 이동
				if(y+1<n && map[y+1][x]!=1) {
					q.add(new Pipe(x,y+1,3));
				}
			} else if(d==3 && y+1<n) {
				// 대각선으로 이동
				if(x+1<n && map[y+1][x+1]!=1 && map[y+1][x]!=1 && map[y][x+1]!=1) {
					q.add(new Pipe(x+1,y+1,2));
				}
				// 아래로 이동
				if(map[y+1][x]!=1) {
					q.add(new Pipe(x,y+1,3));
				}
			}
		}
		System.out.println(result);
	}
}

class Pipe{
	int x;
	int y;
	// 1:가로, 2:대각선, 3:세로
	int d;
	Pipe(int x, int y, int d){
		this.x = x;
		this.y = y;
		this.d = d;
	}
}