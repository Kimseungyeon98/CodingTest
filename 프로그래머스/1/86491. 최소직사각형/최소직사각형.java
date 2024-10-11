class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int[] s:sizes) {
            int tmp=s[0];
            if(s[0]>s[1]){
                s[0] = s[1];
                s[1] = tmp;
            }
        }
        int w = sizes[0][0];
        int h = sizes[0][1];
        for(int[] s:sizes) {
            if(w<s[0]){
                w=s[0];
            }
            if(h<s[1]) {
                h=s[1];
            }
        }
        System.out.println(w);
        System.out.println(h);
        answer=w*h;
        
        return answer;
    }
}