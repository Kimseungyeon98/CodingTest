class Solution {
    public boolean solution(int x) {
        
        int n = 0;
        for (int i = 0; i < Integer.toString(x).length(); i++) {
            n += Integer.parseInt(String.valueOf(Integer.toString(x).charAt(i)));
        }
        
        return x%n==0;
    }
}