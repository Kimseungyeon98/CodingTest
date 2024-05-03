import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 갯수 입력
        int n = Integer.parseInt(br.readLine());

        // 리스트 생성 후 입력받기 (x,y)
        boolean[][] paperCheck = new boolean[101][101];

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x =Integer.parseInt(st.nextToken());
            int y =Integer.parseInt(st.nextToken());
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    paperCheck[j][k]=true;
                }
            }
        }

        int size = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (paperCheck[i][j]) {
                    size++;
                }
            }
        }
        sb.append(size);
        System.out.println(size);

    }
}