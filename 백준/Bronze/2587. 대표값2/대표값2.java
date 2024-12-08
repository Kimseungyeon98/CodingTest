import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            numList.add(n);
            sum+=n;
        }
        System.out.println(sum/numList.size());
        Collections.sort(numList);
        System.out.println(numList.get(2));
    }
}