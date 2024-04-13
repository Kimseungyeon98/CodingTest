import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int x = sc.nextInt();
		int start = 0;
		int end = arr.length-1;
		int sum = 0;
		int cnt = 0;
		while(start<end) {
			sum = arr[start] + arr[end];
			if(sum==x) {
				cnt++;
			}
			
			if(sum>=x) {
				end--;
			} else {
				start++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
		
	}
}