import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> numList = new ArrayList();

            for (int j = 0; j < m; j++) {
                numList.add(sc.nextInt());
            }

            int sum = 0;
            for (int num : numList) {
                sum += num;
            }

            double average = sum / m;

            int cnt = 0;

            for (int num: numList) {
                if (num > average) {
                    cnt += 1;
                }
            }

            double result = (double)cnt*100/m;
            System.out.println(String.format("%.3f",result)+"%");
        }
    }
}