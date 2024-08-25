import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            numList.add(sc.nextInt());
        }

        Collections.sort(numList);

        for (int num :
                numList) {
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}