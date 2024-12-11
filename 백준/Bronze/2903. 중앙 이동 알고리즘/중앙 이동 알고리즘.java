import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//        st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int default_side = 2;

        for (int i = 1; i <= n; i++) {
            default_side+=default_side-1;
        }

        System.out.println(default_side*default_side);
    }
}