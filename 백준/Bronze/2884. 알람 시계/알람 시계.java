import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();


        if (m >= 45) {
            System.out.println(Integer.toString(h) + " " + Integer.toString(m - 45));
        } else {
            if (h == 0) {
                h += 24;
            }
            System.out.println(Integer.toString(h - 1) + " " + Integer.toString(m + 15));
        }
    }
}