import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 2층 -> 1  4  10   20  35  56  84  120  165
        // 1층 -> 1  3  6    10  15  21  28  36   45
        // 0층 -> 1  2  3    4   5   6   7   8    9
        
        // 입력 받기 T : 테스트 회수
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 아파트 생성 [층][호수] -> 14층 14호 까지
        int[][] doubleList = new int[15][15];

        // 0층의 i호에는 i명이 산다.
        for (int i = 1; i < 15; i++) {
            doubleList[0][i] = i;
        }

        // 아파트의 거주민 수 생성
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                doubleList[i][j] = doubleList[i-1][j] + doubleList[i][j-1];
            }
        }

        // 입력 받기 k : 층, n : 호수
        // T회 만큼 k층 n호의 거주민수 출력
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(doubleList[k][n]);
        }
    }
}