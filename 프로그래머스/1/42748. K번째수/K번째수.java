import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> arl = new ArrayList<>();
        for(int[] i: commands){
            int[] arr = Arrays.copyOfRange(array, i[0]-1, i[1]);
            Arrays.sort(arr);
            arl.add(arr[i[2]-1]);
        }
        
        int[] answer = new int[arl.size()];
        for(int i=0;i<arl.size();i++){
            answer[i] = arl.get(i);
        }
        
        return answer;
    }
}