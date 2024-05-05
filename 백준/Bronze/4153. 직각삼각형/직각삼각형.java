import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a==0) break;
			if(pow(a)==pow(b)+pow(c) || pow(b)==pow(a)+pow(c) || pow(c)==pow(a)+pow(b)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
	
	static int pow(int r) {
		return (int)Math.pow(r, 2);
	}
}