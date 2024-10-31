class Solution {
    public int solution(int n) {
        int answer = 0;

        int pn1 = 0;
        int pn2 = 1;

        for (int i = 0; i < n-1; i++) {
            answer = (pn1 + pn2)%1234567;
            pn1 = pn2;
            pn2 = answer;
        }

        return answer%1234567;
    }
}