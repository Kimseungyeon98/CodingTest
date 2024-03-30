import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
         * 로직
         */
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		int[] arr = Arrays.stream((br.readLine()+" 0").split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int left = 0;
		int right = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		while(left<=right&&right<=n) {
			if(sum<s) {
				sum+=arr[right++];
			} else {
				min = Math.min(min, right-left);
				sum-=arr[left++];
			}
		}
		
		System.out.println(min==Integer.MAX_VALUE ? 0:min);
		
		br.close();
	}
}