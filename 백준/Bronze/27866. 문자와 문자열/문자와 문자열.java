import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        String word = st.nextToken();
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(word.charAt(n-1));


    }
}