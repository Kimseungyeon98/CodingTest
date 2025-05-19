import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		char[] arr = br.readLine().toCharArray();
		
		int result = 0;
		int count = 0;
		for(int i=1; i<m-1; i++) {
			if(arr[i-1] == 'I' && arr[i]=='O' && arr[i+1] == 'I') {
				count++;
				if(count==n) {
					count--;
					result++;
				}
				i++;
			} else {
				count = 0;
			}
		}
		
		bw.write((result+"\n"));
		bw.flush();
		bw.close();
	}
}