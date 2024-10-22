import java.util.*;
class Solution {
    public long solution(long n) {
        
        if(Math.sqrt(n)%1==0){
            long i = (int)Math.sqrt(n);
            return (i+1)*(i+1);
        } else {
            return -1;
        }
        
    }
}