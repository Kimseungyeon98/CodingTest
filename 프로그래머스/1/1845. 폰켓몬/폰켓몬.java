import java.util.*;
class Solution {
    public int solution(int[] nums) {
        // Arrays.sort(nums);
        // int cnt = 1;
        // int temp = nums[0];
        // for(int i:nums) {
        //     if(i!=temp) {cnt++; temp=i;}
        // }
        // int answer = 0;
        // if(cnt>=nums.length/2) answer=nums.length/2;
        // else answer=cnt;
        // return answer;
        HashSet<Object> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int answer=0;
        if(set.size()>=nums.length/2) answer=nums.length/2;
        else answer=set.size();
        return answer;
    }
}