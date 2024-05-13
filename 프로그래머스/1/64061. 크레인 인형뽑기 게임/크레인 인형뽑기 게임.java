import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        int tmp = 0;
        
        for(int i=0; i<moves.length; i++){
            int move = moves[tmp]-1;
            int peek = -1;
            if(!st.isEmpty()){
                peek = st.peek();
            }
            
            
            for(int j=0; j<board.length; j++){
                if(board[j][move]!=0){
                if(peek==board[j][move]){
                    board[j][move] = 0;
                    answer+=2;
                    st.pop();
                    
                } else {
                    st.push(board[j][move]);
                    board[j][move] = 0;
                    
                }
                tmp++;
                // System.out.println(st);
                break;
            }
        }
    }

        
        return answer;
    }
}