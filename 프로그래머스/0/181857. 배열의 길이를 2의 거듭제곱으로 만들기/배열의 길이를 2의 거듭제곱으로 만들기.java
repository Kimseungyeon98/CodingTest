import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        int n = (int) Math.pow(2, Math.ceil(Math.log(arr.length) / Math.log(2)));

        answer = Arrays.copyOf(arr, n);
        
        return answer;
    }
}