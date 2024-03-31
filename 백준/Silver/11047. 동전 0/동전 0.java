import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		/*
         * 로직
         */
	
		st = new StringTokenizer(br.readLine());
		
		//동전 가치 갯수
		int n = Integer.parseInt(st.nextToken());
		//목표액
		int k = Integer.parseInt(st.nextToken());
		//동전 가치 배열
		Integer[] coins = new Integer[n];
		for(int i=0; i<n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(coins,Collections.reverseOrder());
		
		//금액 합
		int sum = 0;
		//동전 갯수
		int cnt = 0;
		//coins인덱스
		int index = 0;
		
		while(k!=sum) {
			if(k < coins[index] || k < sum+coins[index]) {
				index++;
			} else {
				sum+=coins[index];
				cnt++;
			}
		}
		System.out.println(cnt);

		br.close();
	}
}