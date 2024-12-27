import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        // n개의 수들과 m개의 테스트 갯수 입력받기
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 어레이 생성 후 입력받기 (x,y)
        int[] numArray = new int[n+1];

        // 어레이에 1~n 숫자 넣기
        for (int i = 0; i <= n; i++) {
            numArray[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start =Integer.parseInt(st.nextToken());
            int end =Integer.parseInt(st.nextToken());
            int s = start;
            int e = end;
            int[] numCopyArray = numArray.clone();

            for (int j = 0; j < end-start+1; j++) {
                numArray[s++] = numCopyArray[e--];
            }
        }
        for (int i = 1; i <= n; i++) {
            sb.append(numArray[i]+" ");
        }
        System.out.println(sb);
    }
}