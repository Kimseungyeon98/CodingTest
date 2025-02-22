import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        for(String str: s.split("")){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(Map.Entry entry: map.entrySet()){
            if(entry.getValue().equals(1)){
                answer+=entry.getKey();
            }
        }
        answer = answer.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

        return answer;
    }
}