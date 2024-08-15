import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		// 참가 인원 수
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		// 사이즈 배열
		int[] sizeArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		st = new StringTokenizer(br.readLine());
		// 티셔츠의 묶음 수
		int t = Integer.parseInt(st.nextToken());
		// 펜의 묶음 수
		int p = Integer.parseInt(st.nextToken());
		
		// 티셔츠의 최소 주문 묶음 수 
		int result = 0;
		for(int tmp : sizeArr) {
			result += tmp%t==0 ? tmp/t : tmp/t + 1;
		}
		System.out.println(result);
		
		System.out.print(n/p + " ");
		System.out.println(n%p);
	}
}