import java.util.*;
public class Main {
    static boolean isValid(String cr) {
        if(cr.equals("(")||cr.equals(")")||cr.equals("[")||cr.equals("]")){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        while(true) {
            String sentence = sc.nextLine();
            if(sentence.equals(".")) break;
            Stack<String> st = new Stack<>();
            for(int i=0; i<sentence.length(); i++) {
                String cr = sentence.substring(i,i+1);
                if(isValid(cr)&&st.isEmpty()) {
                    st.push(cr);
                } else if(isValid(cr)&&!st.isEmpty()) {
                    if(st.peek().equals("(")) {
                        if(cr.equals(")")){
                            st.pop();
                        } else {
                            st.push(cr);
                        }
                    } else if(st.peek().equals("[")) {
                        if(cr.equals("]")) {
                            st.pop();
                        } else{
                            st.push(cr);
                        }
                    }
                }
            }
            if(st.isEmpty()) {
                sb.append("yes"+"\n");
            } else {
                sb.append("no"+"\n");
            }
        }
        System.out.println(sb);
    }
}