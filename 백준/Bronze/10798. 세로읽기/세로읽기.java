import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Character[][] wordList = new Character[5][15];

        int max = 0;

        for (int i = 0; i < 5; i++) {
            String word = sc.nextLine();

            if(max<word.length()) {
                max = word.length();
            }

            for (int j = 0; j < word.length(); j++) {
                wordList[i][j] = word.charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if(wordList[j][i]!=null){
                    System.out.print(wordList[j][i]);
                }
            }
        }
    }
}