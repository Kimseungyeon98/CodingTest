import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> hm = new HashMap<>();
        for(String[] s: clothes){
            hm.put(s[1],hm.getOrDefault(s[1],0)+1);
        }

        for(Map.Entry<String, Integer> pair : hm.entrySet()){
            answer*=(1+pair.getValue());
        }
        return answer-1;
    }
}