class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        long answer = 0;
        int level = 1;

        int left = 1, right = 100_000;

        while(left<=right){
            int mid = (left+right) / 2;
            answer = 0;
            for(int i=0; i<diffs.length; i++){
                if(diffs[i]<=mid){
                    answer += times[i];
                } else {
                    int tmp = diffs[i]-mid;
                    int cur = times[i] + (i > 0 ? times[i - 1] : 0);
                    answer += (long)tmp * cur + times[i];
                }
            }

            if(answer<=limit){
                level = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return level;
    }
}