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
        List<String> mList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            nSet.add(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (nSet.contains(name)) {
                cnt++;
                mList.add(name);
            }
        }

        Collections.sort(mList);

        for (String name :
                mList) {
            sb.append(name+"\n");
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
}