import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		
		
		st = new StringTokenizer(br.readLine());
		
		long result = 0l;
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		result = (a+b) * (a-b);
		
		System.out.println(result);
	}
}