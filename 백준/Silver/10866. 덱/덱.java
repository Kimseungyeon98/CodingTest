import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		Deque<Integer> deque = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String op = st.nextToken();
			
			if(op.equals("push_front")) {
				int t = Integer.parseInt(st.nextToken());
				deque.offerFirst(t);
			} else if(op.equals("push_back")) {
				int t = Integer.parseInt(st.nextToken());
				deque.offerLast(t);
			} else if(op.equals("pop_front")) {
				if(!deque.isEmpty()) {
					System.out.println(deque.pollFirst());
				} else {
					System.out.println(-1);
				}
			} else if(op.equals("pop_back")) {
				if(!deque.isEmpty()) {
					System.out.println(deque.pollLast());
				} else {
					System.out.println(-1);
				}
			} else if(op.equals("size")) {
				System.out.println(deque.size());
			} else if(op.equals("empty")) {
				if(!deque.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(1);
				}
			} else if(op.equals("front")) {
				if(!deque.isEmpty()) {
					System.out.println(deque.peekFirst());
				} else {
					System.out.println(-1);
				}
			} else if(op.equals("back")) {
				if(!deque.isEmpty()) {
					System.out.println(deque.peekLast());
				} else {
					System.out.println(-1);
				}
			}
		}
		
	}
}