class Solution {
    public String solution(int age) {
        String answer = "";
        while(age>9){
            answer+=(char)((age%10)+97);
            age /= 10;
        }
        answer+=(char)(age+97);
        
        String tmp = "";
        
        for(int i=answer.length()-1; i>=0; i--){
            tmp += answer.charAt(i);
        }
        
        return tmp;
    }
}