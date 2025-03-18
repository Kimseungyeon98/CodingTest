import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	static int r,c,t;
	static Integer[][] dustArr;
	static int[][] tmpArr;
	//static Boolean[][] machineArr;
	static int[] scArr;
	static int[] dx = new int[] {1,-1,0,0};
	static int[] dy = new int[] {0,0,-1,1};
	
	static int my;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		
		dustArr = new Integer[r+2][c+2];
		tmpArr = new int[r+2][c+2];
		//machineArr = new Boolean[r+2][c+2];
		
		for(int i=0; i<=r+1; i++) {
			for(int j=0; j<=c+1; j++) {
				dustArr[i][j] = 0;
				//machineArr[i][j] = false;
				if(i==0||j==0||i==r+1||j==c+1) {
					dustArr[i][j] = null;
					//machineArr[i][j] = null;
				}
			}
		}
		
		for(int i=1; i<=r; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=c; j++) {
				dustArr[i][j] = Integer.parseInt(st.nextToken());
				if(dustArr[i][j]==-1) {
					my = i;
				}
			}
		}
		dustArr[my][1] = 0;
		dustArr[my-1][1] = 0;
		
		int result = 0;
		for(int time=0; time<t; time++) {
			diffusion();
			purifierUp(my-1);
			purifierDown(my);
		}
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=c; j++) {
				result+=dustArr[i][j];
			}
		}
		System.out.println(result);
	}

	// 먼지확산
	static void diffusion() {
		tmpArr = new int[r+2][c+2];
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=c; j++) {
				//먼지의 양이 5보다 크다면 확산한다.
				if(dustArr[i][j]>=5) {
					int quantity = dustArr[i][j] / 5;  // 확산되는 양
	                int spreadCount = 0;  // 확산된 방향의 수

	                for (int d = 0; d < 4; d++) {
	                    int y = i + dy[d];
	                    int x = j + dx[d];

	                    // 동서남북의 방향에서 벽이 아니라면
	                    if (x > 0 && x <= c && y > 0 && y <= r) {
	                        if (!(x == 1 && (y == my || y == my - 1))) {
	                            tmpArr[y][x] += quantity;
	                            spreadCount++;
	                        }
	                    }
	                }
	                dustArr[i][j] -= quantity * spreadCount;
				}
			}
		}
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=c; j++) {
				dustArr[i][j] += tmpArr[i][j];
			}
		}
	}
	
	static void purifierUp(int my) {
		// mx = 1
		// my-1 = 기계 위
		int x = 1;
		int y = my;
		//4
		for(int i=y; i>0; i--) {
			dustArr[i][1] = dustArr[i-1][1];
		}
		dustArr[y][x] = 0;
		//3
		for(int i=1; i<=c; i++) {
			dustArr[1][i] = dustArr[1][i+1];
		}
		//2
		for(int i=1; i<=y; i++) {
			dustArr[i][c] = dustArr[i+1][c];
		}
		//1
		for(int i=c; i>0; i--) {
			dustArr[y][i] = dustArr[y][i-1];
		}
		dustArr[y][x] = 0;
	}
	static void purifierDown(int my) {
		// mx = 1
		// my = 기계 아래
		int x = 1;
		int y = my;
		//4
		for(int i=y; i<=r; i++) {
			dustArr[i][1] = dustArr[i+1][1];
		}
		dustArr[y][x] = 0;
		//3
		for(int i=1; i<=c; i++) {
			dustArr[r][i] = dustArr[r][i+1];
		}
		//2
		for(int i=r; i>=y; i--) {
			dustArr[i][c] = dustArr[i-1][c];
		}
		//1
		for(int i=c; i>0; i--) {
			dustArr[y][i] = dustArr[y][i-1];
		}
		dustArr[y][x] = 0;
	}
}