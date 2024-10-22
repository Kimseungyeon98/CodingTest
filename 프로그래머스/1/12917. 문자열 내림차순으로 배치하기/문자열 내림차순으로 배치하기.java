import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++){
                if((int)arr[i]<(int)arr[j]) {
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        for(char c: arr){
            answer+=c;
        }
        
        
        return answer;
    }
}