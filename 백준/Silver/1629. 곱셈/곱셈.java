import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
	
		
		//a의 b승을 c로 나눈 나머지를 구하여라
		
		// (a*b)%c = ((a%c)*(b%c))%c
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		System.out.println(pow(a,b,c));
		
		
		
	}
	
	static long pow(int a, int b, int c) {
		if(b==0) {
			return 1;
		}
		// pow(10,11,12) -> n=pow(10,5,12)=10 -> return ((10*10%12)*(10%12))%12 = 4;
		// pow(10,5,12) -> n=pow(10,2,12)=1 -> return (1*10)%12=10;
		// pow(10,2,12) -> n=pow(10,1,12)=1 -> return 1;
		// pow(10,1,12) -> 1
		long n = pow(a,b/2,c);
		
		if(b%2==0) {
			return n*n%c;
		} else {
			return (n*n%c)*a%c;
		}
	}
}