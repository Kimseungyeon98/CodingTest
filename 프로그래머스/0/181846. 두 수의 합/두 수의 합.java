import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigDecimal bd1 = new BigDecimal(a);
        BigDecimal bd2 = new BigDecimal(b);
        answer = bd1.add(bd2).toString();
        return answer;
    }
}