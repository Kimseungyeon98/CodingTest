import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // n 개의 도시 (1~100)
        int n = Integer.parseInt(br.readLine());
        // m 개의 버스 (1~100,000)
        int m = Integer.parseInt(br.readLine());

        Integer[][] buses = new Integer[n+1][n+1];

        for(int i=0; i<=n; i++) {
            for (int j=0; j<=n; j++) {
                if(i==j){
                    buses[i][j] = 0;
                    continue;
                }
                buses[i][j] = Integer.MAX_VALUE;
            }
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            buses[s][e] = Math.min(d,buses[s][e]);
        }

        for(int k = 1; k <= n; k++) {
            for(int a = 1; a <= n; a++) {
                for(int b = 1; b <= n; b++) {
                    if (buses[a][k] != Integer.MAX_VALUE && buses[k][b] != Integer.MAX_VALUE) {
                        buses[a][b] = Math.min(buses[a][b], buses[a][k] + buses[k][b]);
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(buses[i][j]==Integer.MAX_VALUE){
                    System.out.print(0 + " ");
                } else {
                    System.out.print(buses[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
