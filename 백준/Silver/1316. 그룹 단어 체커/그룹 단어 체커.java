import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 문장 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        // 문장 하나씩 쪼개기
        for (int i = 0; i < n; i++) {
            String sentence = sc.next();
            ArrayList<String> sentencePiece = new ArrayList<>(Arrays.asList(sentence.split("")));
            String k = sentencePiece.get(0);
            HashSet<String> usedSet = new HashSet<>();
            for (String w : sentencePiece) {
                if ((!w.equals(k) & usedSet.contains(w))) {
                    cnt+=1;
                    break;
                }
                usedSet.add(w);
                k = w;
            }
        }
        System.out.println(n-cnt);
    }
}