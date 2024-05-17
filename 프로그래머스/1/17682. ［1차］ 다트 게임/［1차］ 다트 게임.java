class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        char[] arr = dartResult.toCharArray();
        
        int[] scoreArr = new int[3];
        int index = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>='0'&&arr[i]<='9'){
                if(arr[i]=='1'&&arr[i+1]=='0'){
                    scoreArr[index] = 10;
                    i++;
                }else {
                    scoreArr[index] = Character.getNumericValue(arr[i]);
                }
            }else if (arr[i]=='S'||arr[i]=='D'||arr[i]=='T'){
                if(arr[i]=='S'){
                    scoreArr[index] = scoreArr[index++];
                } else if (arr[i]=='D'){
                    scoreArr[index] = scoreArr[index]*scoreArr[index++];
                } else if(arr[i]=='T'){
                    scoreArr[index] = scoreArr[index]*scoreArr[index]*scoreArr[index++];
                }
            } else {
                if(arr[i]=='*'){
                    if(i==2){
                        scoreArr[--index] = scoreArr[index++]*2;
                    }else {
                        scoreArr[index-=2] = scoreArr[index++]*2;
                        scoreArr[index] = scoreArr[index++]*2;
                    }
                } else if(arr[i]=='#'){
                    scoreArr[--index] = -scoreArr[index++];
                }
            }
        }
        for(int i: scoreArr){
            answer+=i;
        }
        return answer;
    }
}