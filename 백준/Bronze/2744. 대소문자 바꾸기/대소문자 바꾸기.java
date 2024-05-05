import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		char[] arr = br.readLine().toCharArray();
		
		String result = "";
		
		for(char c : arr) {
			if(Character.isUpperCase(c)) {
				result += Character.toLowerCase(c);
			} else {
				result += Character.toUpperCase(c);
			}
		}
		
		System.out.println(result);
		
	}
}