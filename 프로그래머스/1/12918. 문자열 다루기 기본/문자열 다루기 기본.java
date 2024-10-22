class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        for(char a : arr) {
            if(s.length()!=4 && s.length()!=6){
                answer = false;
            }
            if((65<=(int)a && (int)a<=90)||(97<=(int)a&&(int)a<=122)){
                    answer=false;
                }
        }
        return answer;
    }
}