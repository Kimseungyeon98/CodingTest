import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int total = 0;
		
		for(int i=0; i<5; i++) {
			total+=Math.pow(Integer.parseInt(st.nextToken()),2);
		}
		
		System.out.println(total%10);

		br.close();
	}
}