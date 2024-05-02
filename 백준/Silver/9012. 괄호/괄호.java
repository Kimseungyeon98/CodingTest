import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            Stack<String> st = new Stack<>();
            String input = sc.next();
            for(int j=0; j<input.length(); j++) {
                String p = input.substring(j,j+1);
                if(st.isEmpty()) {
                    st.push(p);
                }else{
                    if(st.peek().equals("(")) {
                        if(p.equals(")")){
                            st.pop();
                        } else {
                            st.push(p);
                        }
                    } else if(st.peek().equals(")")){
                        st.push(p);
                    }
                }
            }

            if(st.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}