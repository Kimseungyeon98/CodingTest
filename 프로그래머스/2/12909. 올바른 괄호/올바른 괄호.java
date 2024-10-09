class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] arr = new char[s.length()];

        int d = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        for (char a : arr) {
            if (a=='(') {
                d++;
            }
            else {
                d--;
                if (d < 0) {
                    answer = false;
                    break;
                }
            }
        }

        if (d != 0) answer = false;
        return answer;
    }
}