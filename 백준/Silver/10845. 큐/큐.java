import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		
		int tmp = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String op = st.nextToken();
			if(op.equals("push")) {
				int p = Integer.parseInt(st.nextToken());
				tmp = p;
				queue.add(p);
			} else if(op.equals("pop")) {
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(queue.poll());
				}
			} else if(op.equals("size")) {
				System.out.println(queue.size());
			} else if(op.equals("empty")) {
				if(queue.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if(op.equals("front")) {
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(queue.peek());
				}
				
			} else if(op.equals("back")) {
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(tmp);
				}
			}
		}
		
	}
}