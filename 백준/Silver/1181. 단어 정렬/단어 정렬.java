import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String[] wordList = new String[n];
        for (int i = 0; i < n; i++) {
            wordList[i] = br.readLine();
        }

        Set<String> wordSet = new HashSet<>(Arrays.asList(wordList));

        wordList = wordSet.toArray(new String[0]);

        Arrays.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()==o2.length()) {
                    return o1.compareTo(o2);
                }else {
                    return o1.length()-o2.length();
                }
            }
        });

        for (String word :
                wordList) {
            sb.append(word).append("\n");
        }
        System.out.println(sb);
    }
}