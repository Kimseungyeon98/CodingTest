import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Map<Character,Integer> map = new HashMap<>();
        for(char c : my_string.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){

            if(Character.isLowerCase(entry.getKey())){ //소문자
                answer[(int)entry.getKey()-97+26] = entry.getValue();
            } else { //대문자
                answer[(int)entry.getKey()-65] = entry.getValue();
            }
        }

        return answer;
    }
}