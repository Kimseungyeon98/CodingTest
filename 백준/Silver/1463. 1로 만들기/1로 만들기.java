import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		
		arr[0] = arr[1] = 1;
		
		int index=1;
		
		while(index++<n) {
			// 6의 약수
			if(index%6==0) {
				arr[index] = Math.min(arr[index/3],Math.min(arr[index/2],arr[index-1]))+1;
			}
			// 3의 약수
			else if(index%3==0) {
				arr[index] = Math.min(arr[index/3],arr[index-1])+1;
			}
			// 2의 약수
			else if(index%2==0) {
				arr[index] = Math.min(arr[index/2],arr[index-1])+1;
			}
			// 그 외
			else {
				arr[index] = arr[index-1]+1;
			}
		}
		System.out.println(arr[index-1]-1);
		br.close();
	}
}