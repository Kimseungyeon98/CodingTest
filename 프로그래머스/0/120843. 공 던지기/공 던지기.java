class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int i = 0;
        int tmp = 0;
        while(true){
            if(tmp+1==k){
                return numbers[i];
            }
            i += 2;
            i = i%numbers.length;
            tmp++;
        }
        
    }
}