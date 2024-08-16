import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] arr = str.split("");
		
		Long result = 0l;
		int index = 0;
		
		for(String s : arr) {
			int v = (int)s.charAt(0)-96;
			result += v * (int)Math.pow(31,index++);
		}
		
		System.out.println(result);
	}
}