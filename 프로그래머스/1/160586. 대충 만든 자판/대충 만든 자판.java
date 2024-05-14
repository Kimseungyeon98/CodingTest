import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        // hashmap으로 최솟값들만 넣어서 자판을 만들어준다
        Map<Character, Integer> hm = new HashMap<>();
        for(String key: keymap) {
        	for(int i=0; i<key.length(); i++) {
                if(hm.containsKey(key.charAt(i))){
                    if(hm.get(key.charAt(i)) > key.indexOf(key.charAt(i))+1){
                        hm.put(key.charAt(i),key.indexOf(key.charAt(i))+1);
                    }
                } else {
                    hm.put(key.charAt(i),key.indexOf(key.charAt(i))+1);
                }
        	}
        }
        
        for (int i=0; i<targets.length; i++) {
        	String target = targets[i];
			for (int j = 0; j < target.length(); j++) {
				if(hm.containsKey(target.charAt(j))) {
					answer[i]+=hm.get(target.charAt(j));
				} else {
					answer[i] = -1;
					break;
				}
			}
		}
        
        return answer;
    }
}