import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n과 m을 받는다.
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 더블리스트 두개를 만든다.
        int[][] A = new int[n][m];
        int[][] B = new int[n][m];

        // A행렬 입력받기.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // B행렬 입력받기.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }
}