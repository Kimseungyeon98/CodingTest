import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//정렬
		Arrays.sort(arr,new Comparator<int[]>() {
			//시작 시간이 낮은 순
			// 같다면 그 길이가 짧은 순
			@Override
			public int compare(int[] o1, int[] o2) {
				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.  
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		
        //첫번째 고정
		int cnt = 1;
        // 마지막 종료시간 임시 저장용
		int tmpEnd = arr[0][1];
        // 두번째 스케줄부터
		for(int i=1; i<arr.length; i++) {
			//만약 그전 스케줄의 종료시간보다 시작시간이 큰 스케줄이 있다면 카운트하고 해당 종료시간 저장
            if(arr[i][0]>=tmpEnd) {
				cnt++;
				tmpEnd = arr[i][1];
			}
		}
		
		System.out.println(cnt);
	}
}