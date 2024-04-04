import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//n은 1000까지
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[1001];
		arr[1] = 1;
		arr[2] = 3;
		for(int i=3; i<n+1 ; i++) {
			arr[i] = (arr[i-1]+(arr[i-2]*2))%10007;
		}
		
		System.out.println(arr[n]);
		br.close();
	}
}