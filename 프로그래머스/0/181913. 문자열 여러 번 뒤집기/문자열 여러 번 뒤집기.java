class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for(int i=0; i<queries.length; i++){
            String front = answer.substring(0,queries[i][0]);
            String tmp = new StringBuilder(answer.substring(queries[i][0],queries[i][1]+1)).reverse().toString();
            String back = answer.substring(queries[i][1]+1);
            answer = front.concat(tmp).concat(back);
        }

        return answer;
    }
}