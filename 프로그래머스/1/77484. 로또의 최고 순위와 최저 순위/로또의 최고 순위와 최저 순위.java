import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        // lottos 에는 0이 포함된 숫자 6개
        // win_nums 에는 당첨 번호 6개
        // result[0] = lottos에서 0을 제외한 당첨 번호 갯수
        // result[1] = lottos에서 0이 당첨 번호라면 당첨 번호 갯수
        List<Integer> lotto = new ArrayList<>();
        int zero = 0;
        for (int l :
                lottos) {
            lotto.add(l);
            if(l==0) {
                zero++;
            }
        }
        List<Integer> win_num = new ArrayList<>();
        for (int w :
                win_nums) {
            win_num.add(w);
        }

        lotto.retainAll(win_num);
        // lotto = {1,2,3,0,5,0}
        // win_num = {2,4,1,7,5}
        // 현재 lotto = {1,2,5}
        // result[0] = {1,2,3,5} 중 당첨
        // result[1] = {1,2,3,0,5,0} 중 당첨
        answer[0] = lotto.size();
        answer[1] = lotto.size()+zero;
        
        switch(lotto.size()+zero){
            case 6:
                answer[0] = 1;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 2:
                answer[0] = 5;
                break;
            case 1:
                answer[0] = 6;
                break;
            case 0:
                answer[0] = 6;
                break;
        }
        
        switch(lotto.size()){
            case 6:
                answer[1] = 1;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 2:
                answer[1] = 5;
                break;
            case 1:
                answer[1] = 6;
                break;
            case 0:
                answer[1] = 6;
                break;
        }
        
        

        return answer;
    }
}