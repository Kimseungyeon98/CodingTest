import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        List<Integer> list = Arrays.asList(a,b,c,d);
        
        Collections.sort(list);
        
        int aa = list.get(0);
        int bb = list.get(1);
        int cc = list.get(2);
        int dd = list.get(3);
        
        if(aa==dd){
            return 1111 * dd;
        } else if(aa==cc || bb==dd){
            return (int)Math.pow(bb*10 + (aa+dd-bb),2);
        } else if(aa==bb && cc==dd){
            return (aa+cc)*Math.abs(aa-cc);
        } else if(aa==bb){
            return cc*dd;
        } else if(bb==cc){
            return aa*dd;
        } else if(cc==dd){
            return aa*bb;
        } else {
            return aa;
        }
        
    }
}