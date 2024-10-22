class Solution {
    public String solution(String s) {
        String answer = "";
        int tmp =0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)==' '){
                answer+=s.charAt(i);
                tmp=0;
                continue;
            }
            if(tmp%2==0){
                answer+=Character.toUpperCase(s.charAt(i));
                tmp++;
            } else {
                answer+=Character.toLowerCase(s.charAt(i));
                tmp++;
            }
        }
        
        return answer;
    }
}