class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        StringBuilder sb = new StringBuilder(my_string.substring(s,e+1));
        sb = sb.reverse();

        answer = my_string.substring(0,s).concat(sb.toString()).concat(my_string.substring(e+1));

        return answer;
    }
}