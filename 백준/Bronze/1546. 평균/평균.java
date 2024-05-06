import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numList = new ArrayList();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            numList.add(sc.nextDouble());
        }

        double maxScore = Collections.max(numList);

        for (int i = 0; i < n; i++) {
            numList.set(i,(numList.get(i)/maxScore) * 100);
        }

        double sum = 0;

        for (double num : numList) {
            sum += num;
        }

        double average = sum / numList.size();

        System.out.println(average);
    }
}