import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            if (arr[(int)word.charAt(i)-97] == -1){
                arr[(int)word.charAt(i)-97] = i;
            }
        }

        for (int num: arr) {
            System.out.print(num+" ");
        }
    }
}