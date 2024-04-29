import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String[][] wordList = new String[n][2];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            wordList[i][0] = st.nextToken();
            wordList[i][1] = st.nextToken();
        }

        Arrays.sort(wordList,Comparator.comparingInt(o1-> {
            return Integer.parseInt(o1[0]);
        }));

        for (int i = 0; i < n; i++) {
            sb.append(wordList[i][0] + " " + wordList[i][1] + "\n");
        }
        System.out.println(sb);
    }
}