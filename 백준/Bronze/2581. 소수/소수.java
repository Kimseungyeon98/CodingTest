import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n과 m 입력받기
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 소수 리스트 만들기
        // 0부터 m까지의 리스트 생성
        int [] primeList = new int[m+1];
        for (int i = 0; i <= m; i++) {
            primeList[i] = i;
        }

        // 1은 소수가 아님
        primeList[1] = 0;

        // 에라토스테네스의 체 사용
        for (int i = 2; i <= m ; i++) {
            int k = 2;
            if (primeList[i] != 0) {
                try {
                    while(true) {
                        primeList[i*k] = 0;
                        k += 1;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        // n부터 m까지의 소수 합 출력
        int sumPrime = 0;
        for (int i = n; i <= m; i++) {
            sumPrime += primeList[i];
        }
        // 만약 범위내에 소수가 없다면 -1 출력
        if (sumPrime == 0) {
            System.out.println(-1);

        }else{
            System.out.println(sumPrime);
        }

        // n부터 m까지의 소수 중 최솟값 출력
        for (int i = n; i <= m; i++) {
            if (primeList[i] != 0) {
                System.out.println(primeList[i]);
                break;
            }
        }
    }
}