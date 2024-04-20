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
		
		int t = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[t+1][t+1];
		int index = 1;
		
		for (int i = 1; i < t+1; i++) {
			st = new StringTokenizer(br.readLine());
			index = 1;
			while(st.hasMoreTokens()) {
				arr[i][index++] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j <= i; j++) {
				arr[i][j] += Math.max(arr[i-1][j-1], arr[i-1][j]); 
			}
		}
		
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[t][i]>result) {
				result = arr[t][i];
			}
		}
		
		System.out.println(result);
		
		br.close();
	}
}