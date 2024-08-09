class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        long n = num;
        if(n==1) return 0;
        
        while(n!=1){
            if(cnt==500) break;
            
            if(n%2==0) {
                n = n / 2;
            } else {
                n = (n*3)+1;
            }
            
            cnt++;
        }
        if(cnt==500) return -1;
        else return cnt;
    }
}