import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 소수 리스트를 생성한다.
        int [] primeList = new int[10001];
        for (int i = 0; i < 10001; i++) {
            primeList[i]=i;
        }
        primeList[1] = 0;

        for (int i = 2; i <= 10000 ; i++) {
            int k = 2;
            if (primeList[i] != 0) {
                try {
                    while(true) {
                        primeList[i*k]=0;
                        k+=1;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int l = n/2;
            for (int j = n/2; j < n; j--) {
                // j랑 l 둘 다 소수라면 출력
                if (primeList[j] == j & primeList[l] == l) {
                    System.out.println(j+" "+l);
                    break;
                }
                l+=1;
            }
        }
    }
}