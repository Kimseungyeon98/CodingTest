import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
    
        Arrays.sort(tangerine);

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int t:tangerine) {
            hm.put(t,hm.getOrDefault(t,0)+1);
        }

        List<Integer> lst = new ArrayList<>(hm.keySet());

        lst.sort((o1,o2)-> hm.get(o2)-hm.get(o1));

        for (int i = 0; i < lst.size(); i++) {
            k-= hm.get(lst.get(i));
            if(k<=0) {
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}