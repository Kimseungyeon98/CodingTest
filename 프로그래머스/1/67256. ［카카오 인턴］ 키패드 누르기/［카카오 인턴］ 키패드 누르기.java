class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int lTmp = 10;
        int rTmp = 12;
        
        for(int n : numbers){
            if(n==1||n==4||n==7){
                answer+="L";
                lTmp = n;
            } else if(n==2||n==5||n==8||n==0){
                if(n==0){
                    n=11;
                }
                if(rTmp==lTmp){
                    if(hand.equals("right")){
                        answer+="R";
                        rTmp = n;
                    } else{
                        answer+="L";
                        lTmp = n;
                    }
                } else {
                    int ld = (Math.abs(n-lTmp)/3) + (Math.abs(n-lTmp)%3);
                    int rd = (Math.abs(n-rTmp)/3) + (Math.abs(n-rTmp)%3);
                    
                    if(ld<rd){
                        answer+="L";
                        lTmp=n;
                        
                    }else if(ld>rd){
                        answer+="R";
                        rTmp=n;
                    } else {
                        if(hand.equals("right")){
                            answer+="R";
                            rTmp=n;
                        } else {
                            answer+="L";
                            lTmp=n;
                        }
                    }
                }
            } else if(n==3||n==6||n==9){
                answer+="R";
                rTmp = n;
            }
        }
        
        return answer;
    }
}