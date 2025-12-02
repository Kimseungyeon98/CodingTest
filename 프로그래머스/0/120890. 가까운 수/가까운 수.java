class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        // 반복문
        // 차이를 구함
        // 차이가 가장 최소일 때 answer을 업데이트 해줌
        // * 가장 가까운 수가 여러 개일 경우 더 작은 수 return
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(min>Math.abs(array[i]-n)){
                answer = array[i];
                min = Math.abs(array[i]-n);
            } else if(min==Math.abs(array[i]-n)){
                answer = Math.min(answer,array[i]);
                min = Math.abs(answer-n);
            }
        }
        return answer;
    }
}