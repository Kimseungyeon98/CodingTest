import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 문장 입력받기
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();

        // 띄워쓰기 기준으로 나눠서 리스트에 담기
        List<String> wordList = new ArrayList<String>(Arrays.asList(sentence.split(" ")));

        // 공백이 리스트에 담긴 경우 삭제
//        wordList.remove(" ");
//        wordList.remove("\n");

        if (sentence.length() == 0) {
            System.out.println(0);
            System.exit(0);
        }
        // 리스트 요소 개수 출력
        System.out.println(wordList.size());
    }
}