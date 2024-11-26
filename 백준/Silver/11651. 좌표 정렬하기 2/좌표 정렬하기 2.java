import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] numList = new int[n][2];

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            numList[i][0] = Integer.parseInt(st.nextToken());
            numList[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numList,(o1, o2) -> {
            if (o1[1]==o2[1]){
                return o1[0] - o2[0];
            } else{
                return o1[1] - o2[1];
            }
        });

        for (int i = 0; i < n; i++) {
            sb.append(numList[i][0]+" "+numList[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}