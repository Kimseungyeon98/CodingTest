import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        // n 입력
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        Map<String,Integer> nMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nMap.put(st.nextToken(),0);
        }


        // m 입력
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            if(nMap.containsKey(st.nextToken())) {
                sb.append(1+" ");
            } else {
                sb.append(0+" ");
            }
        }

        System.out.println(sb);

    }
}