class Solution {
    public int[] solution(long n) {
        String b = Long.toString(n);
        int[] answer = new int[b.length()];
        for (int i = 0; i<b.length() ; i++) {
            answer[i] = Integer.parseInt(Character.toString(b.charAt(b.length()-i-1)));
        }
        return answer;
    }
}