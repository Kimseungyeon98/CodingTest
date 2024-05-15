import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(String p:participant) {
            hm.put(p,hm.getOrDefault(p,0)+1);
        }
        for(String c:completion){
            hm.put(c,hm.getOrDefault(c,0)-1);
        }
        String answer = "";
        for(String p:participant){
            if(!hm.get(p).equals(0)){
                answer=p;
            }
        }
        return answer;
    }
}