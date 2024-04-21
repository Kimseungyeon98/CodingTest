import java.util.Scanner;
import java.util.Stack;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			
			if(n>i+1) {
				st.add(n);
			}
			if(!st.isEmpty()&&st.peek()==i+1) {
				st.pop();
			}
			
			if(i==t-1) {
				if(st.isEmpty()) {
					System.out.println("Nice");
				} else {
					System.out.println("Sad");
				}
			}
		}

	
		sc.close();
    }
}