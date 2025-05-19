import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		String tmp = "I" + "OI".repeat(n);
		
		int answer = 0;
		
		for(int i=0; i<m-tmp.length()+1; i++) {
			int w = tmp.length()+i-1;
			if(tmp.equals(str.substring(i,w+1))) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}