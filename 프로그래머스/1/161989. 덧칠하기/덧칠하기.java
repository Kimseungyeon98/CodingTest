import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // n은 전체 영역
        // m은 한번에 칠할 수 있는 영역
        // section은 색을 칠해야 하는 영역
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = i+1;
        }
        for(int s : section) {
            arr[s-1] = 0;
        }
        
        for(int i=0; i<n; i++) {
            if(arr[i] == 0) {
                try{
                    for(int j=i; j<i+m; j++) {
                    arr[j] = i+j;
                    }
                    answer++;
                } catch(Exception e) {
                    return ++answer;
                }
                
            }
        }
        
        return answer;
    }
}