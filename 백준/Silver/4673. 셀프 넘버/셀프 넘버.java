import java.util.*;

public class Main {

    public static int selfNum(int n) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(n);
        while (n > 0) {
            nums.add(n % 10);
            n /= 10;
        }
        for (int num:
                nums) {
            n += num;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<Integer>();
        for (int i = 1; i <= 10000 ; i++) {
            numList.add(i);
        }

        for (int i = 1; i <= 10000; i++) {
            if (numList.contains(selfNum(i))) {
                numList.remove(Integer.valueOf(selfNum(i)));
            }
        }
        for (int num :
                numList) {
            System.out.println(num);
        }
    }
}