import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String op = st.nextToken();
			if(op.equals("push")) {
				int p = Integer.parseInt(st.nextToken());
				stack.add(p);
			} else if(op.equals("pop")) {
				if(stack.empty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.pop());
				}
			} else if(op.equals("size")) {
				System.out.println(stack.size());
			} else if(op.equals("empty")) {
				if(stack.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if(op.equals("top")) {
				if(stack.empty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.peek());
				}
				
			}
		}
		
	}
}