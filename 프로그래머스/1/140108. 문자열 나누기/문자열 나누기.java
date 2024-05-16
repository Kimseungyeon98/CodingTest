class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        
        char x = arr[0];
        
        int xNum = 0;
        int xNotNum = 0;
        int tmp = 0;
        
        for(int i=0; i<arr.length; i++){
            
            if(x==arr[i]){
                xNum++;
                
                // System.out.println("x는 " + x + "이고 arr[i]는 "+ arr[i] + "입니다.");
            } else {
                xNotNum++;
                
                // System.out.println("x는 " + x + "이고 arr[i]는 "+ arr[i] + "입니다.");
            }
            
            // System.out.println("현재 xNum은 :" + xNum + " 이고, xNotNum은 : " + xNotNum +" 입니다.");
            
            if((xNum==xNotNum)){
                // System.out.println("----------xNum과 xNotNum이 일치합니다 ---------");
                answer++;
                tmp += xNum+xNotNum;
                xNum=0;
                xNotNum=0;
                if(tmp<arr.length){
                    x = arr[tmp];
                }
            }
            if(i==arr.length-1 && xNum!=0){
                    answer++;
                }
        }
        
        return answer;
    }
}