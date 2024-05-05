import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));
		
	}
	
	
	//최소공배수
	static int lcm(int a, int b) {
		int a1 = a;
		int b1 = b;
		while(a1!=b1) {
			if(a1>b1) {
				b1+=b;
			} else if (a1<b1) {
				a1+=a;
			}
		}
		
		return a1;
	}
			
			
			
	//최대공약수
	static int gcd(int a, int b) {
		int c;
		while(b!=0) {
			c = a % b;
			a = b;
			b = c;
		}
		return a;
	}
}