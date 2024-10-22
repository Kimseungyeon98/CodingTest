import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        // set 만들고
        Set<Integer> set = new HashSet<>();
        
        // set에 각 인덱스 별 합 넣고 중복 제거하고
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        // i=0
        // j=1,2,3,4
        
        // i=1
        // j=2,3,4
        
        // i=2
        // j=3,4
        
        // i=3
        // j=4
        
        
        
        
        // 확인 차 출력해주고
        System.out.println(set);
        
        // set -> 배열로 바꾸고
        Integer[] arr = set.toArray(new Integer[0]);
        int[] answer = new int[arr.length];
        
        // Integer[] 에서 int[] 로 바꾸고
        for(int i=0; i<arr.length; i++) {
            answer[i] = arr[i];
        }
        Arrays.sort(answer);
        
        // 값 반환
        return answer;
    }
}