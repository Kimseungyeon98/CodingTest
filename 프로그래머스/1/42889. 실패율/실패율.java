import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        
        Map<Integer,Double> hm = new HashMap<>();
        // 각 스테이지에 머물러 있는 사람들의 수
        int[] stayStagePeople = new int[N+2];
    
        for(int stage : stages){
            stayStagePeople[stage]++;
        }
        
        // 각 스테이지를 클리어한 사람들의 수
        int[] clearStagePeople = new int[N+2];
        
        for(int stage : stages){
            for(int i=0; i<stage; i++){
                clearStagePeople[i+1]++;
            }
        }
    
        
        // 0으로 나누거나 0을 나눌 경우에 NaN처리되기 때문에 처리해줘야 한다.
        for(int i =1; i<=N; i++){
            if(stayStagePeople[i]!=0&&clearStagePeople[i]!=0){
                hm.put(i,(double)stayStagePeople[i]/clearStagePeople[i]);
            } else {
                hm.put(i,0.0);
            }
            
        }
        
        
        //실패율 값으로 스테이지 번호를 내림차순 정렬
        List<Integer> list = new ArrayList<>(hm.keySet());
        
        Collections.sort(list,(o1,o2) -> Double.compare(hm.get(o2), hm.get(o1)));
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}