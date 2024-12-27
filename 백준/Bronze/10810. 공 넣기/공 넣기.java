import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] numList = new int[n];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int j = a-1; j <= b-1; j++) {
                numList[j] = c;
            }
        }

        for (int num : numList) {
            System.out.print(num+ " ");
        }
    }
}