import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int dis = 0;
        // 순간이동: 현재까지 온 거리 * 2 (건전지 사용 x)
        // 점프   : k 칸 앞으로 점프 (k만큼 건전지 사용)
        
        
        // n을 2로 나누면서 홀수가 된다면 -1 해주고 ans에 +1 해준다
        // 이 과정을 n이 0이 될 때 까지 반복한다
        
        while(n!=0) {
            if(n%2!=0) {
                n-=1;
                ans++;
            }
            n/=2;
        }
        
        
        return ans;
    }
}