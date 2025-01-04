import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // n 입력
        st = new StringTokenizer(br.readLine());
        String word = st.nextToken();

        Set<String> wordSet = new HashSet<>();


        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                wordSet.add(word.substring(i,j+1));
            }
        }
        System.out.println(wordSet.size());
    }
}