import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static int[] arr = new int[11];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
         * 로직
         */
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for(int i=4; i<11;i++) {
			arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
		}
		
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(arr[n]);
		}

		br.close();
	}
}