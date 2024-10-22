import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");

        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for (String n :
                arr) {
            if(max<Integer.parseInt(n)) max = Integer.parseInt(n);
            if(min>Integer.parseInt(n)) min = Integer.parseInt(n);
        }

        answer += min + " " + max;
        
        
        return answer;
    }
}