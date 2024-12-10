import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//        st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int C =  sc.nextInt();

            int q = 0; // 0.25
            int d = 0; // 0.10
            int n = 0; // 0.05
            int p = 0; // 0.01

            while (C >0) {
                if (C >= 25) {
                    C -= 25;
                    q += 1;
                } else if (C >= 10) {
                    C -= 10;
                    d += 1;
                } else if (C >= 5) {
                    C -= 5;
                    n += 1;
                } else {
                    C -= 1;
                    p += 1;
                }
            }
            System.out.println(q+" "+d+" "+n+" "+p+" ");
        }

    }
}