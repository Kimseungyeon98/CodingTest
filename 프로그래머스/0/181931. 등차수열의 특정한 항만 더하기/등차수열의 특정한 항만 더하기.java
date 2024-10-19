class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        // 첫째항이 a
        // 공차가 d 인 등차수열
        // included[i]가 i+1항을 의미
        // 1항부터 n항까지 included가 true인 항들만 더한값을 반환하는 함수
        
        int tmp = a;
        for(int i=0; i<included.length; i++){
            if(included[i]){
                answer+=tmp;
            }
            tmp += d;
        }
        
        
        return answer;
    }
}