import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n==-1) {
                break;
            }

            List<Integer> factorList = new ArrayList<>();

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    factorList.add(i);
                }
            }

            int sum = 0;
            for (int i = 0; i < factorList.size(); i++) {
                sum += factorList.get(i);
            }

            if (sum == n) {
                System.out.print(n + " = 1 ");
                for (int i = 1; i < factorList.size(); i++) {
                    System.out.print("+ " + factorList.get(i) + " ");
                }
                System.out.println();

            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}