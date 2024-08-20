class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long c = x;
        for(int i=0; i<n; i++) {
            answer[i]=c;
            c+=x;
        }
        return answer;
    }
}