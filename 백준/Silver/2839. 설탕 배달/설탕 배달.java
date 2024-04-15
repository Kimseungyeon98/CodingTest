import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 총 용량 : 1 2 3 4 5 / 6 7 8 9 10 / 11 12 13 14 15 / 16 17 18 19 20 / 21 22 23 24 25 / 26

        // 3  개수 : 0 0 1 0 0 / 2 0 1 3 0  / 2  4  1  3  0  / 2  4  1  3  0  / 2  4  1  3  0

        // 5  개수 : 0 0 0 0 1 / 0 0 1 0 2  / 1  0  2  1  3  / 2  1  3  2  4  / 3  2  4  3  5

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n==4 | n == 7) {
            System.out.println(-1);
        } else if (n%5==1) {
            System.out.println(((n/5)-1)+2);
        } else if (n%5==2) {
            System.out.println(((n/5)-2)+4);
        } else if (n%5==3) {
            System.out.println((n/5)+1);
        } else if (n%5==4) {
            System.out.println(((n/5)-1)+3);
        } else if (n%5==0) {
            System.out.println(n/5);
        }
    }
}