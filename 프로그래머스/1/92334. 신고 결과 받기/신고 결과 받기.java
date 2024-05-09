import java.util.*;
import java.util.Map.Entry;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 신고 누적 횟수
        Map<String,Integer> map = new HashMap<>();
        // 정지된 자
        List<String> stopList = new ArrayList<>();
        // 메일 받은 수
        Map<String,Integer> result = new HashMap<>();
        
        // report 중복 제거
        Set<String> st = new HashSet<String>();
        for(int i=0; i<report.length; i++){
            st.add(report[i]);
        }
        
        // map: 신고 누적 횟수
        for(String name : st){
            String[] names = name.split(" ");
            String second = names[1];
            map.put(second,map.getOrDefault(second,0)+1);
        }
        // System.out.println("신고 누적 횟수: "+map);
        // System.out.println("신고자와 신고당한자: "+list);
        
        for(String key: map.keySet()){
            if(map.get(key)>=k){
                stopList.add(key);
            }
        }
        
        // System.out.println("정지당한 자: "+stopList);
        
        for(String name : st){
            String[] names = name.split(" ");
            String first = names[0];
            String second = names[1];
            if(stopList.contains(second)){
                result.put(first,result.getOrDefault(first,0)+1);
            }
        }
        // System.out.println("메일 받은 수: "+result);
        
        int[] answer = new int[id_list.length];
        for(int i=0; i<id_list.length; i++){
            if(result.get(id_list[i])!=null){
                answer[i] = result.get(id_list[i]);
            } else {
                answer[i] = 0;
            }   
        }
        
        
        return answer;
    }
}