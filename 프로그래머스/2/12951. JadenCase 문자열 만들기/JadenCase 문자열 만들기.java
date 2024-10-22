class Solution {
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split("");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }

        arr[0] = arr[0].toUpperCase();

        boolean check = false;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i].isBlank()) {
                check = true;
            }
            if(check) {
                arr[i + 1] = arr[i + 1].toUpperCase();
            }
            check=false;
        }

        for (int i = 0; i < arr.length; i++) {
            answer+=arr[i];
        }
        
        return answer;
    }
}