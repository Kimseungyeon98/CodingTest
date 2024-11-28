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
        int m = Integer.parseInt(st.nextToken());

        Set<String> nSet = new HashSet<>();
        Set<String> mSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nSet.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            mSet.add(st.nextToken());
        }

        int cnt = 0;
        for (String num :
                nSet) {
            if(!mSet.contains(num)) {
                cnt ++;
            }
        }
        for (String num :
                mSet) {
            if(!nSet.contains(num)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}