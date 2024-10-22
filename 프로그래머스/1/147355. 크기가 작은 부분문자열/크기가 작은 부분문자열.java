import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0; i<=t.length()-p.length(); i++){
            arr.add(t.substring(i,i+p.length()));
        }
        for(int i=0; i<arr.size(); i++){
           if(Long.parseLong(arr.get(i))<=Long.parseLong(p)) {
               answer++;
           }
        }
        
        return answer;
    }
}