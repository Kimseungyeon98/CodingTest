class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        
        int tmp;
        if(direction.equals("right")){
            tmp = numbers[numbers.length-1];
            for(int i=numbers.length-2; i>=0; i--){
                numbers[i+1] = numbers[i];
            }
            numbers[0] = tmp;
        } else if(direction.equals("left")){
            tmp = numbers[0];
            for(int i=0; i<numbers.length-1; i++){
                numbers[i] = numbers[i+1];
            }
            numbers[numbers.length-1] = tmp;
        }
        
        return numbers;
    }
}