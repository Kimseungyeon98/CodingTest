import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();

        if (C-B>0) {
            System.out.println(A/(C-B)+1);
        } else {
            System.out.println(-1);
        }
    }
}