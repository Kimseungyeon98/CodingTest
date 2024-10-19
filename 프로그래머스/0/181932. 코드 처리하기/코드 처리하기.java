class Solution {
    public String solution(String code) {
        String answer = "";
        
        //code를 앞에서부터 읽으며 "1"이면 mode를 바꿈
        // mode에 따라 code를 읽어가며 ret 만듬
        
        //mode는 0과 1
        // idx를 0부터 code의길이 - 1 까지 1씩 ++하며 code[idx]의 값에 따라 행동
        
        // mode ==0
        
        // code[idx] != "1" 
        // idx == 짝수 -> ret 맨뒤에 code[idx] 추가
        
        // code[idx] == "1"
        // mode = 0 -> mode = 1
        int mode = 0;
        for(int i=0; i<code.length(); i++){
            if(mode==0){
                if(code.charAt(i)!='1'){
                    if(i%2==0){
                        answer += code.charAt(i);
                    }
                }else {
                    mode = 1;
                }
            } else if (mode==1){
                if(code.charAt(i)!='1'){
                    if(i%2==1){
                        answer += code.charAt(i);
                    }
                }else {
                    mode = 0;
                }
            }
        }
        if(answer.length()==0){
            answer = "EMPTY";
        }
        
        return answer;
    }
}