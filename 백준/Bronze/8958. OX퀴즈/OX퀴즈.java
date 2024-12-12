import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] oxList;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String ox = sc.next();
            int score = 0;
            oxList = ox.split("");

            String k = "z";
            int w = 0;
            for (String j : oxList) {
                if (j.equals("X")) {
                    w = 0;
                    continue;
                }
                w += 1;
                if (j.equals("O")) {
                    score += w;
                }
            }
            System.out.println(score);
        }

    }
}