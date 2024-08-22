import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int result = 0;
        for(int i=0; i<k; i++) {
            int n = sc.nextInt();
            if(n!=0){
                st.push(n);
            } else {
                st.pop();
            }
        }
        for(int n:st) {
            result+=n;
        }
        System.out.println(result);
    }
}