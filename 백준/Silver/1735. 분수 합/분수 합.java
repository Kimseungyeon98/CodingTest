import java.io.*;
import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        if(a%b==0) {
            return b;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[][] fr = new int[2][2];

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = gcd(a,b);

            a = a/c;
            b = b/c;

            fr[i][0] = a;
            fr[i][1] = b;
        }

        int up = fr[0][1]*fr[1][0] + fr[0][0]*fr[1][1];
        int down = fr[0][1]*fr[1][1];

        sb.append(up/gcd(up,down)+" "+down/gcd(up,down));

        System.out.println(sb);
    }
}