class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1. n을 3진법으로 변환
        String num = Integer.toString(n,3);
        // 2. 3진법으로 변환한 수를 뒤집기
        String reverseNum = "";
        for(int i=num.length()-1; i>=0; i--){
            reverseNum+=num.charAt(i);
        }
        // 3. 뒤집은 수를 10진법으로 변환
        answer = Integer.parseInt(reverseNum,3);
        
        return answer;
    }
}