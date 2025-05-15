class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        boolean[] checkArr = new boolean[schedules.length];
        for(int i=0; i<schedules.length; i++){
            int h = schedules[i]/100;
            int m = schedules[i]%100+10;
            if(m>=60){
                h+=1;
                m-=60;
            }
            int time = h*100 + m;
            for(int j=0; j<7; j++){
                int nowday = startday + j;
                if(nowday%7==6 || nowday%7==0) {
                    continue;
                }
                
                if(time<timelogs[i][j]) {
                    checkArr[i] = true;
                    break;
                }
            }
        }
        
        for(boolean b : checkArr){
            if(!b) answer++;
        }
        
        return answer;
    }
}