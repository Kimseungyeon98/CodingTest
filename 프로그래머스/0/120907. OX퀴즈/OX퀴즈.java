class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        int result = 0;
        String[] arr;
        char o;
        for(int i=0; i<quiz.length; i++){
            arr = quiz[i].split(" ");
            result = Integer.parseInt(arr[0]);
            o = arr[1].charAt(0);
            if(o=='+'){
                result += Integer.parseInt(arr[2]);
            } else if (o=='-'){
                result -= Integer.parseInt(arr[2]);
            }
            
            if(result==Integer.parseInt(arr[4])){
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
            
        }
        
        return answer;
    }
}