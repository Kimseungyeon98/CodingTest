import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean check = false;
		
		while(!check) {
			String word = br.readLine();
			if(word.equals("0")) {
				break;
			}
			
			char[] charArray = word.toCharArray();
			
			int index = charArray.length;
			
			char[] tmp = new char[index];
			
			
			for(int i=0; i<charArray.length; i++) {
				tmp[i] = charArray[--index];
			}
			
			String reverseWord = "";
			
			for(char c: tmp) {
				reverseWord += c;
			}
			
			if(word.equals(reverseWord)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}