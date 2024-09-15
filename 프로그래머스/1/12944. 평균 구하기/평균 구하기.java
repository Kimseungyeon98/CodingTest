class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int n = 0;
        for(int a : arr) {
            answer += a;
            n++;
        }
        answer /= n;
        
        return answer;
    }
}