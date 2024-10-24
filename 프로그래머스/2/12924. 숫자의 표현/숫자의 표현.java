class Solution {
    public int solution(int n) {
        int answer = 0;
        // i를 1부터 쭉 더한다
        // if 더한 값이 n보다 커질 경우
        // 멈추고 더한 값을 초기화한다.
        // 그리고 다시 해당 i부터 더하기 시작한다.
        // else if 더한 값이 n이랑 같을 경우
        // answer에 1을 더하고
        // 더한 값을 초기화한다.
        // 다음 i부터 다시 더하기 시작한다.
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                sum+=j;
                if(sum>n) break;
                else if (sum==n) {
                    answer++;
                    break;
                }
            }
            sum = 0;
        }
        return answer;
    }
}