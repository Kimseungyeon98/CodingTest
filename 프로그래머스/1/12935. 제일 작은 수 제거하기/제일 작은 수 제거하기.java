import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int min = 10000;
        
        for(int i:arr) {
            if(min>i) min=i;
        }
        
        for(int i=0; i<arr.length; i++){
            if(Integer.compare(arr[i],min)!=0) {
                answer.add(arr[i]);
            }
        }
        
        int[] ar = new int[answer.size()];
        
        for(int i=0; i<answer.size(); i++) {
            ar[i] = answer.get(i);
        }
        
        if(answer.size()!=0){
            return ar;
        } else {
            return new int[]{-1};
        }
    }
}