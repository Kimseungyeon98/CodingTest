import java.util.*;
class Solution {
    
    // 1. string
    // 2. stack
    // 3. 재귀함수
    
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        for(int i: ingredient){
            st.push(i);
            
            if(st.size()>=4){
                if(st.get(st.size()-1)==1&&st.get(st.size()-2)==3&&st.get(st.size()-3)==2&&st.get(st.size()-4)==1) {
                    st.pop();
                    st.pop();
                    st.pop();
                    st.pop();
                    answer++;
                }
            }
        }
        
        return answer;
    }
}