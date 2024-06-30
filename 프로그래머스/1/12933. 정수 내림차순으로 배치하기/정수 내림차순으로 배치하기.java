import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        String b = Long.toString(n);
        Integer[] arr = new Integer[b.length()];
        for(int i=0; i<b.length(); i++) {
            arr[i] = Integer.parseInt(Character.toString(b.charAt(i)));
        }
        Arrays.sort(arr);
        Arrays.sort(arr,(o1,o2)->o2-o1);
        for(int i=0; i<arr.length; i++) {
            answer+=arr[i];
        }
        return Long.parseLong(answer);
    }
}