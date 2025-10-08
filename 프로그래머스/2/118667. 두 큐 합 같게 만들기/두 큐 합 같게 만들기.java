import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long q1Sum = 0;
        long q2Sum = 0;

        for(int n : queue1){
            q1.add(n);
            q1Sum += n;
        }
        for(int n : queue2){
            q2.add(n);
            q2Sum += n;
        }

        // 총 합이 홀수일 경우 -1 반환
        if((q1Sum+q2Sum)%2==1){
            return -1;
        }

        int answer = 0;
        int tmp = 0;

        while(answer <= (queue1.length + queue2.length)*2){
            if(q1Sum < q2Sum){
                tmp = q2.poll();
                q1.add(tmp);
                q1Sum += tmp;
                q2Sum -= tmp;
                answer++;
            } else if (q1Sum > q2Sum){
                tmp = q1.poll();
                q2.add(tmp);
                q1Sum -= tmp;
                q2Sum += tmp;
                answer++;
            } else {
                return answer;
            }
        }

        return -1;
    }
}