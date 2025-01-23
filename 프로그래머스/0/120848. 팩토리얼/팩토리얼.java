class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while(n!=0) {
            n/=answer++;
            System.out.println(n);
        }
        
        return answer-2;
    }
}