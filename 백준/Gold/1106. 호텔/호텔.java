import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //C
        int C = Integer.parseInt(st.nextToken());
        //N
        int N = Integer.parseInt(st.nextToken());

        int[] dp = new int[2001];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        int[][] arr = new int[N][2];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            // 비용
            int cost = Integer.parseInt(st.nextToken());
            // 고객의 수
            int customer = Integer.parseInt(st.nextToken());
            arr[i][0] = cost;
            arr[i][1] = customer;

            int n = 0;
            int curCustomer;
            while((curCustomer = customer * n) < dp.length){
                dp[curCustomer] = Math.min(dp[curCustomer],cost*n);
                n++;
            }
        }

        for(int i = 0; i < N; i++){
            // 비용
            int cost = arr[i][0];
            // 고객의 수
            int customer = arr[i][1];

            for (int j = customer; j < dp.length; j++) {
                if (dp[j - customer] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - customer] + cost);
                }
            }
        }

        // 호텔의 고객을 적어도 C명 늘리기 위해 투자해야하는 최솟값
        System.out.println(Arrays.stream(Arrays.copyOfRange(dp, C, dp.length)).min().getAsInt());
    }
}
