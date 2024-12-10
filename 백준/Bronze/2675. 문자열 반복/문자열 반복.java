import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            String word = sc.next();
            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < m; k++) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}