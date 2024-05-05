import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		
		
		st = new StringTokenizer(br.readLine());
		
		long result = 0l;
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		result = (a+b) * (a-b);
		
		System.out.println(result);
	}
}