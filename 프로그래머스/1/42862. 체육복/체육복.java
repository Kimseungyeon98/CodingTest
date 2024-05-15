import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=1; i<n+1; i++) {
            hm.put(i,"have");
        }
        for(int r:reserve){
            hm.put(r,"reserve");
        }
        for(int i:lost) {
            if(hm.get(i).equals("have")){
                hm.put(i,"lost");
            } else{
                hm.put(i,"have");
            }
        }
        
        System.out.println(hm);
        
        for(int i=1; i<n+1; i++){
            if(hm.get(i).equals("lost")) {
                if(i!=1&&hm.get(i-1).equals("reserve")){
                    hm.put(i-1,"have");
                    hm.put(i,"have");
                    continue;
                }
                if(i!=n&&hm.get(i+1).equals("reserve")){
                    hm.put(i+1,"have");
                    hm.put(i,"have");
                    continue;
                }
            }
        }
        
        System.out.println(hm);
        
        for(int i=1; i<n+1; i++) {
            if(hm.get(i).equals("have")||hm.get(i).equals("reserve")){
                answer++;
            }
        }
        
        
        
        return answer;
    }
}