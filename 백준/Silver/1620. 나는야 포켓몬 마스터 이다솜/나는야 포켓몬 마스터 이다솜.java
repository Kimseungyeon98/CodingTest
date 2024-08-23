import java.io.*;
import java.util.*;

public class Main {
    public static boolean isNum (String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Scanner sc = new Scanner(System.in);


        // n,m 입력
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer,String> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            map1.put(i+1,word);
            map2.put(word,i+1);
        }


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String unknown = st.nextToken();
            if(isNum(unknown)) {
                sb.append(map1.get(Integer.parseInt(unknown))+"\n");
            } else {
                sb.append(map2.get(unknown)+"\n");
            }

        }
        System.out.println(sb);
    }
}
