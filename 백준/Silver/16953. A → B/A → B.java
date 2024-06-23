import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int cnt = 1;
	
		// a:2 b:162
		// 2 4 8 81 162
		
		while(a!=b) {
			if(a>b) {
				System.out.println(-1);
				return;
			}
			if(b%10==1) {
				b = op2(b);
			} else if(b%2==0) {
				b = op1(b);
			} else {
				System.out.println(-1);
				return;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
	static int op1(int num) {
		return num/2;
	}
	static int op2(int num) {
		return num/10;
	}
}