class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        int tmp = 0;
        for(String str : arr){
            if(str.equals("Z")){
                answer -= tmp;
            } else {
                answer += Integer.parseInt(str);
                tmp = Integer.parseInt(str);
            }
        }
        return answer;
    }
}