class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n=i; n<=j; n++){
            int num = n;
            while(num>0){
                if(num%10==k){
                    answer++;
                }
                num/=10;
            }
        }
        return answer;
    }
}