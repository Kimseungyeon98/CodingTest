import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (String s : strArr) {
            map.put(s.length(), map.getOrDefault(s.length(), 0) + 1);
        }

        int result = Integer.MIN_VALUE;
        for (int count : map.values()) {
            result = Math.max(result, count);
        }

        return result;
    }
}