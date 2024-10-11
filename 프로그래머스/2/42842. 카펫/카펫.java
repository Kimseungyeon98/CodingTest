class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown+yellow;
        
        for(int i=1; i<total+1; i++) {
            if(total%i==0&&i>=total/i) {
                if((i-2)*((total/i)-2)==yellow){
                    answer[0] = i;
                    answer[1] = total/i;
                    break;
                }
            }
        }
        // 1. 합의 약수 중 조건을 만족하는 것들 뽑아내기
        
        
        // 2. 그 중 (세로-2)*(가로-2)가 yellow와 같아지는 것 찾기
        
        
        return answer;
    }
}