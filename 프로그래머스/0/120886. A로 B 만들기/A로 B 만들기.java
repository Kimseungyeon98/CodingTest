import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String[] a = before.split("");
        String[] b = after.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        
        if(Arrays.equals(a,b)){
            return 1;
        } else {
            return 0;
        }
    }
}