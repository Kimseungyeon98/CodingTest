import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] maxArr = new int[3];
        int[] minArr = new int[3];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            if(i==0) {
                minArr[0] = maxArr[0] = f;
                minArr[1] = maxArr[1] = s;
                minArr[2] = maxArr[2] = t;
            } else {
                int beforeF = minArr[0], beforeT = minArr[2];
                minArr[0] = Math.min(minArr[0], minArr[1]) + f;
                minArr[2] = Math.min(minArr[1], minArr[2]) + t;
                minArr[1] = Math.min(Math.min(beforeF, minArr[1]),beforeT) + s;

                beforeF = maxArr[0];
                beforeT = maxArr[2];
                maxArr[0] = Math.max(maxArr[0], maxArr[1]) + f;
                maxArr[2] = Math.max(maxArr[1], maxArr[2]) + t;
                maxArr[1] = Math.max(Math.max(beforeF, maxArr[1]),beforeT) + s;
            }
        }
        System.out.println(Math.max(Math.max(maxArr[0], maxArr[1]), maxArr[2]) + " " + Math.min(Math.min(minArr[0], minArr[1]), minArr[2]));
    }
}