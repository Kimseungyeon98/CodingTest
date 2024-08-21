import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        //n
        int n = Integer.parseInt(st.nextToken());
        //m
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1];
        int[][] sumArr = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Arrays.stream(("0 "+br.readLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        sumArr[1][1] = arr[1][1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sumArr[i][j] = sumArr[i][j-1] + sumArr[i-1][j] - sumArr[i-1][j-1] + arr[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(sumArr[x2][y2]+sumArr[x1-1][y1-1]-sumArr[x2][y1-1]-sumArr[x1-1][y2]);

        }
    }
}