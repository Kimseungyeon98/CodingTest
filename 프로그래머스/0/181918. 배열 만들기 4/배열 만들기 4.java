import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        
        Stack<Integer> st = new Stack<>();
        int i = 0;
        
        while(i<arr.length){
            if(st.empty()){
                st.push(arr[i]);
                i++;
            } else {
                if(st.peek()<arr[i]){
                    st.push(arr[i]);
                    i++;
                }else {
                    st.pop();
                }
            }
        }
        int n = st.size();
        stk = new int[n];
        for(int j=n-1; j>=0; j--){
            stk[j] = st.pop();
        }
        return stk;
    }
}