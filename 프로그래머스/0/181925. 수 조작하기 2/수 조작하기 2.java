class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int tmp = numLog[0];
        int n = 0;
        for(int i=1; i<numLog.length; i++){
            n = numLog[i];
            
            if(n-tmp == 1){
                answer += "w";
            } else if(n-tmp == -1){
                answer += "s";
            } else if(n-tmp == 10){
                answer += "d";
            } else if(n-tmp == -10) {
                answer += "a";
            } else {
                
            }
            tmp = n;
        }
        return answer;
    }
}