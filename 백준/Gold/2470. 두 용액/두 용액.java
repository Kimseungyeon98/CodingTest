import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
         * 로직
         */
		int n = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(arr);
		
		int left = 0;
		int right = n-1;
		int min = Integer.MAX_VALUE;
		int i1 = 0;
		int i2 = 0;
		
		while(left<right) {
			int sum = Math.abs(arr[left] + arr[right]);
			
			if(min>sum) {
				min = sum;
				i1 = left;
				i2 = right;
				if(sum==0) {
					break;
				}
			}
			
			if(Math.abs(arr[left])<Math.abs(arr[right])) {
				right--;
			} else {
				left++;
			}
		}
		System.out.println(arr[i1]+" "+arr[i2]);
		
		br.close();
	}
}