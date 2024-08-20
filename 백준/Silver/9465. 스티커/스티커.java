import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 횟수
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());

            //스티커의 점수
            int[][] arr = new int[2][];
            arr[0] = Arrays.stream(("0 "+br.readLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
            arr[1] = Arrays.stream(("0 "+br.readLine()).split(" ")).mapToInt(Integer::parseInt).toArray();

            //dp알고리즘
            int[][] dp = new int[2][n+1];
            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];
            
            for (int j = 2; j <= n; j++) {
                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + arr[0][j];
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + arr[1][j];
            }

            System.out.println(Math.max(dp[0][n],dp[1][n]));
        }
    }
}