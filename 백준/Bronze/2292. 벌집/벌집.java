import java.util.*;

public class Main {
    public static void main(String[] args) {
        // n을 입력받는다
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        // n이 range(2+6*i, 7+6*(i+1)) 안에 포함될때의 i 출력
        // 1, 2~7 , 8~19 , 20~37
        int i = 1;
        int a = 2;
        int b = 7;
        while(true) {
            if (n==1) {
                System.out.println(1);
                break;
            } else if (2<=n&n<=7) {
                System.out.println(2);
                break;
            }
            if(a <= n & n <= b) {
                System.out.println(i+1);
                break;
            }
            a += 6*i;
            b += 6*(i+1);
            i++;
        }
    }
}