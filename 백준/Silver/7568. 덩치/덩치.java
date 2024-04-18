import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        List<List<Integer>> totalList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            list.add(Integer.parseInt(st.nextToken()));
            list.add(Integer.parseInt(st.nextToken()));
            totalList.add(list);
        }

        int rank = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (totalList.get(i).get(0)<totalList.get(j).get(0) && totalList.get(i).get(1)<totalList.get(j).get(1)) {
                    rank++;
                }
            }
            sb.append(rank+" ");
            rank = 1;
        }
        // 키와 몸무게 모두 다른 사람 보다 크다면 1
        // 키는 크지만 몸무게가 작거나 키는 작지만 몸무게는 크다 하는 경우는 공동순위
        // 모두 작다면 n
        //2 2 1 2 5
        System.out.println(sb);
    }
}