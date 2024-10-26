import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> want_list = new HashMap<>();
        for(int i=0; i<want.length; i++){
            want_list.put(want[i],number[i]);
        }

        for(int i=0; i<discount.length; i++){
            HashMap<String, Integer> copy_list = new HashMap<>(want_list);
            for(int j=i; j<i+10&&j<discount.length; j++) {
                if(copy_list.containsKey(discount[j])) {
                    copy_list.put(discount[j],copy_list.get(discount[j])-1);
                }
            }
            for (int j = 0; j < want.length; j++) {
                if(!copy_list.get(want[j]).equals(0)){
                    break;
                }
                if(j==want.length-1) answer+=1;
            }


        }

        // want_list를 만들고
        // 10일치 씩의 discount 목록을 조회한다.
        // want_list에 discount[i]가 존재한다면
        // value값 - 1 한다.
        // 모든 value가 0이 되는 순간이 있다면 i 반환
        //                           없다면 0 반환
        return answer;
    }
}