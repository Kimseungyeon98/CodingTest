import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        boolean[] primeArray = new boolean[1000001];
        Arrays.fill(primeArray,true);
        primeArray[0] = false;
        primeArray[1] = false;

        for (int i = 2; i < Math.sqrt(1000001)+1; i++) {
            int tmp = 2*i;
            while(1000001 > tmp) {
                if (primeArray[tmp]) {
                    try {
                        primeArray[tmp] = false;
                    } catch (Exception e) {
                        continue;
                    }
                }
                tmp += i;
            }
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            int a = m/2;
            int b = a;
            int cnt = 0;
            while(b>1) {
                if (primeArray[a]&&primeArray[b]) {
                    cnt++;
                }
                a++;
                b--;
            }
            sb.append(cnt+"\n");
        }

        System.out.println(sb);
    }
}