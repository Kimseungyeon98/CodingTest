import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int f = a* ((b%100)%10);
        int s = a* ((b%100)/10);
        int t = a* (b/100);

        System.out.println(f);
        System.out.println(s);
        System.out.println(t);
        System.out.println(f + s * 10 + t * 100);
    }
}