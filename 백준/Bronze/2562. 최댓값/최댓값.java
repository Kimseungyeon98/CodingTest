import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < 9; i++) {
            numList.add(sc.nextInt());
        }

        int max = Collections.max(numList);

        int cnt = 1;

        for (int num : numList) {
            if (num == max) {
                break;
            }
            cnt += 1;
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}