import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // H:층 W:너비 N:몇번째손님
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            // YYXX -> YY는 층수 XX는 호수
            // 층수는 N % H
            // 호수는 N / H
            int YY = N % H;
            int XX = (N / H) + 1;
            if (YY == 0) {
                YY = H;
                XX -= 1;
            }
            System.out.println(YY*100 + XX);
        }
    }
}