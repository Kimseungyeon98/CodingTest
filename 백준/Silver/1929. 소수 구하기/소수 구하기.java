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
        int m = Integer.parseInt(st.nextToken());

        for (int i = n; i <= m; i++) {
            var bi = new BigInteger(Integer.toString(i));
            if(bi.isProbablePrime(10)) {
                sb.append(bi+"\n");
            }
        }
        System.out.println(sb);
    }
}