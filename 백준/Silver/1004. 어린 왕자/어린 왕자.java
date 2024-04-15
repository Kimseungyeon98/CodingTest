import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int cnt = 0;
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                // 출발점과 중심점 사이의 거리
                double d1 = Math.sqrt(Math.pow(x1-cx,2)+Math.pow(y1-cy,2));
                // 도착점과 중심점 사이의 거리
                double d2 = Math.sqrt(Math.pow(x2-cx,2)+Math.pow(y2-cy,2));

                if(d1<r) cnt++;
                if (d2<r) cnt++;
                if(d1<r && d2<r) cnt-=2;
            }
            sb.append(cnt+"\n");
        }
        System.out.println(sb);
    }
}