import java.io.*;
import java.util.*;

public class Main {
	static Integer[] dp;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new Integer[n+1];
		arr = new int[n+1];
		
		for(int i=1; i<n+1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;
		dp[1] = arr[1];
		
		if(n>=2) {
			dp[2] = arr[1]+arr[2];
		}
		
		System.out.println(find(n));
		br.close();
	}
	
	static int find(int n) {
		if(dp[n]==null) {
			dp[n] = Math.max(find(n-2), find(n-3) + arr[n-1])+arr[n];
		}
		return dp[n];
	}
}