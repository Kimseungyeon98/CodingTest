import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < n; i++) {
            var bi = new BigInteger(br.readLine());

            if(bi.isProbablePrime(10)) {
                sb.append(bi+"\n");
            } else {
                sb.append(bi.nextProbablePrime()+"\n");
            }

        }
        System.out.println(sb);
    }
}