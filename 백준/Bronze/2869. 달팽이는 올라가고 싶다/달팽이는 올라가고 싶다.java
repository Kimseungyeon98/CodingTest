import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 이동가능거리 : A
        // 자는동안 미끄러지는 거리 : B
        // 높이 : V

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        // 하루동안 움직인 거리 : A-B
        int moveDistance = A-B;
        double result = (double)(V-A) / moveDistance;
        
        System.out.println((int)Math.ceil(result) + 1);
    }
}