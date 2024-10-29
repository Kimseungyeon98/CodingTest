import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        //elemnets의 길이가 n이라고 가정한다면
        int[] tmp = new int[elements.length];
        for(int i=0; i<elements.length; i++){
            tmp[i] = elements[i];
        }
        elements = new int[elements.length*2];
        for(int i=0; i<elements.length; i++){
            if(tmp.length>i){
                elements[i] = tmp[i];
            } else {
                elements[i] = tmp[i-tmp.length];
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i=1; i<=tmp.length; i++){
            // 길이가 1~n까지의 모든 경우의 수를 반복해야함
            
            // 길이
            int length = i;
            int start = 0;
            int end = start+length-1;
            while(elements.length>end){
                int sum = 0;
                for(int j=start; j<=end; j++){
                    sum += elements[j];
                }
                set.add(sum);
                start++;
                end ++;
            }
        }
        
        return set.size();
    }
}