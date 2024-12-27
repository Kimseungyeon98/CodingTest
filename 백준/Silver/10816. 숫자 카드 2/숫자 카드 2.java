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

        Map<Integer,Integer> nMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int ch = Integer.parseInt(st.nextToken());
            if (!nMap.containsKey(ch)) {
                nMap.put(ch,1);
            } else {
                nMap.put(ch,nMap.get(ch)+1);
            }
        }

        // m 입력
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(st.nextToken());
            if(nMap.get(k)==null){
                sb.append(0+" ");
            } else {
                sb.append(nMap.get(k)+" ");
            }
        }
        System.out.println(sb);
    }
}