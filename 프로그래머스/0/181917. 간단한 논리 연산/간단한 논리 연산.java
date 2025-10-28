class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        // 아래는 or
        // 위는 and
        answer = (x1||x2)&&(x3||x4);
        return answer;
    }
}