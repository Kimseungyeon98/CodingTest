import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            xList.add(Integer.parseInt(st.nextToken()));
            yList.add(Integer.parseInt(st.nextToken()));
        }
        int x = Collections.max(xList)-Collections.min(xList);
        int y = Collections.max(yList)-Collections.min(yList);

        if (n>1) {
            System.out.println(x*y);
        } else {
            System.out.println(0);
        }
    }
}