import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i=t; i>0; i--) {
        	stack.add(i);
        }
        
        while(stack.size()!=1) {
        	//1. 제일 위의 카드 버림
        	stack.pollLast();
        	//2. 제일 위의 카드 바닥으로 보냄
        	stack.addFirst(stack.pollLast());
        	//3. 반복
        }
        System.out.println(stack.pop());
        
	}
}