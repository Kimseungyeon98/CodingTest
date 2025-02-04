import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start = (int)Integer.MAX_VALUE;
        int end = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        if(start<=end){
            return Arrays.copyOfRange(arr,start,end+1);
        } else {
            return new int[]{-1};
        }
        
    }
}
