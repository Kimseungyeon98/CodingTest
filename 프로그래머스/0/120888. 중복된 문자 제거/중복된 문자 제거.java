import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<String> set = new HashSet<>();
        for(String s: my_string.split("")){
            if(set.contains(s)){
                continue;
            }
            answer += s;
            set.add(s);
        }
        return answer;
    }
}