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
		
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b)-Integer.parseInt(c));
		System.out.println(Integer.parseInt(a+b)-Integer.parseInt(c));
	}
}