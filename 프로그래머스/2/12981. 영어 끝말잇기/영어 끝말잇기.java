import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};

        int a = 0;
        int b = 0;

        for (int i=1; i<words.length; i++) {

            a = (i%n)+1;
            b = (i/n)+1;

            if(words[i].length()==1) break;

            if(words[i].charAt(0)!=words[i-1].charAt(words[i-1].length()-1)) {
                answer[0] = a;
                answer[1] = b;
            }

            for (int j = 0; j < i-1; j++) {
                if(words[i].equals(words[j])) {
                    answer[0] = a;
                    answer[1] = b;
                }
            }
            
            if(answer[0]!=0) {
                break;
            }

        }
        return answer;
    }
}