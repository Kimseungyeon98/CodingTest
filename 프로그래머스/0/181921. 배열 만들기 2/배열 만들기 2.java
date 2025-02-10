import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            boolean b = true;
            if(i%5==0&&((i%5)%10==0 || (i%5)%10==1)){
                String[] arr = (i+"").split("");
                for(int j=0; j<arr.length; j++){
                    if(!arr[j].equals("0")&&!arr[j].equals("5")){
                        b = false;
                        break;
                    }
                }
                if(b){
                    list.add(i);
                }
            }
        }
        if(list.size()==0){
            return new int[]{-1};
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}