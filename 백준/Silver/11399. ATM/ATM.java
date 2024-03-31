import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		/*
         * 로직
         */
	
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] sumArr = new int[n+1];
		int total =0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			sumArr[i+1] = arr[i]+sumArr[i];
			total+=sumArr[i+1];
		}
		
		System.out.println(total);
		
		br.close();
	}
}