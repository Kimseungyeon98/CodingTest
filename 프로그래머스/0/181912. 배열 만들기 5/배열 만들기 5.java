import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(String str : intStrs){
            String st = str.substring(s,s+l);
            if(Integer.parseInt(st)>k){
                list.add(Integer.parseInt(st));
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}