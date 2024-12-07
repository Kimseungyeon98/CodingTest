import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numList[][] = new int[9][9];
        int max = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numList[i][j] = sc.nextInt();
                if (numList[i][j] > max) {
                    max = numList[i][j];
                }
            }
        }

        System.out.println(max);

        loopOut:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (numList[i][j] == max) {
                    System.out.println((i+1) + " " + (j+1));
                    break loopOut;
                }
            }
        }
    }
}