import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	//n: n*n 크기 , m: 치킨집의 최대 개수
	static int n, m;
	
	//집 정보 지도
	static int[][] arr;
	
	//일반 집과 치킨 집 좌표 리스트
	static List<House> commonHouseList, chickenHouseList;
	
	//열려있는 치킨집
	static boolean[] openChicken;
	
	//최소 치킨 거리를 구하기 위한 수
	static int result;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//n: n*n 크기 , m: 치킨집의 최대 개수
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		//집 정보 지도
		arr = new int[n][n];
		
		//일반 집 좌표 리스트
		commonHouseList = new ArrayList<>();
		//치킨 집 좌표 리스트
		chickenHouseList = new ArrayList<>();
		
		//최소 치킨 거리를 구하기 위해 최대상수로 초기화
		result = Integer.MAX_VALUE;
		
		//집 정보 입력 -> arr
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				int houseCode = Integer.parseInt(st.nextToken());
				arr[i][j] = houseCode;
				if(houseCode == 1) {
					//일반집
					commonHouseList.add(new House(i,j));
				} else if(houseCode == 2) {
					//치킨집
					chickenHouseList.add(new House(i,j));
				}
			}
		}
		//치킨집이 폐업했는지 체크
		openChicken = new boolean[chickenHouseList.size()];
		
		dfs(0,0);
		
		System.out.println(result);
	}
	static void dfs(int start, int cnt) {
		//만약 cnt와 폐업시키지 않을 치킨집의 최대 갯수가 같다면
		if(cnt==m) {
			int res = 0;
			
			//일반 집 순회 시작
			for(int i=0; i<commonHouseList.size(); i++) {
				// 최소 비교를 위한 최대상수
				int temp = Integer.MAX_VALUE;
				
				//임의의 일반 집 기준으로 치킨 집 중 open한 모든 치킨집과의 거리를 비교하여 최소 거리를 구한다.
				for(int j=0; j<chickenHouseList.size(); j++) {
					if(openChicken[j]) {
						int distance = Math.abs(commonHouseList.get(i).x - chickenHouseList.get(j).x) + Math.abs(commonHouseList.get(i).y - chickenHouseList.get(j).y);
						temp = Math.min(temp, distance);
					}
				}
				//res에 모든 일반 집으로 부터의 치킨집 까지의 각 최소거리의 합을 구한다.
				res += temp;
			}
			//result에 최솟값을 계속 저장하면서 치킨집이 폐업할 수 있는 모든 경우의 수를 순회한다.
			result = Math.min(result, res);
			return;
		}
		
		//치킨집이 폐업할 수 있는 모든 경우의 수를 순회하기 위함
		for(int i= start; i<chickenHouseList.size(); i++) {
			openChicken[i] = true;
			dfs(i+1, cnt+1);
			openChicken[i] = false;
		}
	}
	
	static class House {
		int x;
		int y;
		
		public House(int x, int y) {
			this.x = x;
			this.y = y;
		};
	}
}