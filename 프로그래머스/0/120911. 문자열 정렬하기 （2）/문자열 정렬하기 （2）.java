import java.util.*;
class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).map(String::toLowerCase).sorted().reduce("", String::concat);
    }
}