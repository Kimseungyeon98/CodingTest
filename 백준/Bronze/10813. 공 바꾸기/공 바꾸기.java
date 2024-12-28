import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] numList = new int[n];

        for (int i = 1; i <= n; i++) {
            numList[i-1] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = numList[a-1];
            int d = numList[b-1];
            numList[a-1] = d;
            numList[b-1] = c;
        }

        for (int num : numList) {
            System.out.print(num+ " ");
        }
    }
}