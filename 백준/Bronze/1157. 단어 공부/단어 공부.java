import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 단어 입력받아 소문자로 변경
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.toLowerCase();

        // 알파벳 개수 세기 위해 alphabet 생성
        List<Integer> alphabet = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            alphabet.add(0);
        }

        // 단어 쪼개서 wordList에 넣기
        List<Character> wordList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            wordList.add(word.charAt(i));
        }

        // 단어 알파벳들을 순회하며 alphabet 개수세기
        for (int w : wordList) {
            w -= 97;
            alphabet.set(w,alphabet.get(w)+1);
        }

        // 알파벳 리스트에서 가장 값이 높은 인덱스 뽑아내기
        int max = Collections.max(alphabet);
        int maxIndex = alphabet.indexOf(max);

        if (Collections.frequency(alphabet,max) >1 ) {
            System.out.println("?");
        }else {
            String result = String.valueOf((char)(maxIndex+97));
            System.out.println(result.toUpperCase());
        }
    }
}