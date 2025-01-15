import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer,Integer.MAX_VALUE);
        for(int i=0; i<queries.length; i++){
            int fst = queries[i][0];
            int lst = queries[i][1];
            int min = queries[i][2];
            int[] array = new int[lst-fst+1];
            for(int j=0; j<=lst-fst; j++){
                array[j] = arr[j+fst];
            }
            Arrays.sort(array);
            for(int j=0; j<=lst-fst; j++){
                if(array[j]>min){
                    answer[i]=array[j];
                    break;
                }
            }
            if(answer[i]==Integer.MAX_VALUE)answer[i]=-1;
        }
        return answer;
    }
}