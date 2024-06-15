import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        for (int i = n0; i < 101; i++) {
            int fn = a1*i+a0;
            int gn = c*i;
            if (fn>gn) {
                System.out.println(0);
                break;
            }
            if(fn<=gn && i==100){
                System.out.println(1);
            }
        }
    }
}