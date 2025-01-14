class Solution {
    public int solution(int[] num_list) {
        int n;
        int answer = 0;
        for(int num : num_list){
            n = num;
            while(n!=1){
                if(n%2==0){
                    n/=2;
                } else {
                    n-=1;
                    n/=2;
                }
                answer++;
            }
        }
        
        return answer;
    }
}