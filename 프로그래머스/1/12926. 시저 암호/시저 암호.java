class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++) {
            if(Character.isUpperCase(arr[i])){
                if((int)arr[i]+n>90){
                    answer+=(char)((int)arr[i]+n-26);
                } else {
                    answer+=(char)((int)arr[i]+n);
                }
            } else if(Character.isLowerCase(arr[i])) {
                if((int)arr[i]+n>122){
                    answer+=(char)((int)arr[i]+n-26);
                } else {
                    answer+=(char)((int)arr[i]+n);
                }
            } else if(Character.compare(arr[i],' ')==0) {
                answer+=arr[i];
            }
        }
        
        return answer;
    }
}