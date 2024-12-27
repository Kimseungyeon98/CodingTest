import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> numList = new ArrayList();

        for (int i = 1; i <= n; i++) {
            numList.add(sc.nextInt());
        }
        int m = sc.nextInt();
        int cnt = 0;
        for (int num : numList) {
            if (m == num) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}