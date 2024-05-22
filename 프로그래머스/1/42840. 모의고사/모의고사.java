import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        int[] f={1,2,3,4,5};
        int[] s={2,1,2,3,2,4,2,5};
        int[] t={3,3,1,1,2,2,4,4,5,5};
        
        arr.add(point(f,answers));
        arr.add(point(s,answers));
        arr.add(point(t,answers));
        
        System.out.println(arr);
        for(int i=0; i<3; i++){
            if(!Collections.max(arr).equals(0)&&arr.get(i).equals(Collections.max(arr))) answer.add(i+1);
        }
        
        int[] qwe = new int[answer.size()];
        for(int i=0; i<answer.size(); i++) {
            qwe[i] = answer.get(i);
        }
        
        return qwe;
    }
    public int point(int[] omr, int[] answers) {
        int l = omr.length;
        int tmp = 0;
        int p=0;
        for(int a:answers){
            if(tmp==l) tmp=0;
            if(omr[tmp++]==a) p++;
        }
        return p;
    }
}