import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][3];
		
		int[][] dp = new int[n+1][3];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				dp[i+1][j] = Math.min(dp[i][j+1<3?j+1:j-2], dp[i][j+2<3?j+2:j-1]) + arr[i][j];
			}
		}
		
		System.out.println(Math.min(dp[n][0],Math.min(dp[n][1],dp[n][2])));
		
		br.close();
	}
}