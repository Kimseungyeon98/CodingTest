import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start = -1;
        int end = -1;
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                cnt++;
                if(start==-1){
                    start = i;
                } else {
                    end = i;
                }
            }
        }
        if(start!=-1&& end!=-1){
            return Arrays.copyOfRange(arr,start,end+1);
        } else if (cnt==1){
            return new int[]{2};
        } else {
            return new int[]{-1};
        }
        
    }
}