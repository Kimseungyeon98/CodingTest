import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		Stack<Integer> stack = new Stack<>();
		int start = 0;
		
		int n = Integer.parseInt(br.readLine());
		
		while(n-->0) {
			int num = Integer.parseInt(br.readLine());
			
			if(start<num) {
				
				for (int i = start+1; i <= num; i++) {
					stack.push(i);
					sb.append("+\n");
				}
				start = num;
				
			} else if(stack.peek()!=num) {
				System.out.println("NO");
				return;
			}
			sb.append("-\n");
			stack.pop();
		}
		System.out.println(sb);
	}
}