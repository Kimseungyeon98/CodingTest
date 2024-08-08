import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> arrLst = new ArrayList<>();
        for(int i:arr) {
            if(i%divisor==0){
                arrLst.add(i);
            }
        }
        Collections.sort(arrLst);
        int[] answer = new int[arrLst.size()];
        for(int i=0;i<arrLst.size();i++){
            answer[i] = arrLst.get(i);
        }
        if(arrLst.size()!=0) {
            return answer;
        } else {
            return new int[]{-1};
        }
    }
}