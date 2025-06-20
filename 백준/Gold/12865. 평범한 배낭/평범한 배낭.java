import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static int [] dp;
    static int N,K;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 물품의 수
        N = Integer.parseInt(st.nextToken());
        // 버틸 수 있는 무게
        K = Integer.parseInt(st.nextToken());

        arr = new int[N][2];
        dp = new int[K+1];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            // 무게
            int w = Integer.parseInt(st.nextToken());
            // 가치
            int v = Integer.parseInt(st.nextToken());

            for(int j = K; j >= w; j--){
                dp[j] = Math.max(dp[j], v + dp[j-w]);
            }
        }
        System.out.println(dp[K]);
    }
}