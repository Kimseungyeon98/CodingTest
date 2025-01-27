class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int n : array){
            for(int i=0; i<(n+"").length(); i++){
                if((n+"").charAt(i)=='7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}