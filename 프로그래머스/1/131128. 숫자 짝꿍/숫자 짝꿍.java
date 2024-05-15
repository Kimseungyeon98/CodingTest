import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuffer sb = new StringBuffer();
        String answer = "";
        
        List<Character> xList = new ArrayList<>();
        List<Character> yList = new ArrayList<>();
        
        for(int i=0; i<X.length(); i++){
            xList.add(X.charAt(i));
        }
        for(int i=0; i<Y.length(); i++){
            if(xList.contains(Y.charAt(i))){
                yList.add(Y.charAt(i));    
            }
        }
        
        List<Character> result = new ArrayList<>();
        
        // for(int i=0; i<xList.size(); i++){
        //     char xtmp = xList.get(i);
        //     for(int j=0; j<yList.size(); j++){
        //         char ytmp = yList.get(j);
        //         if(xtmp==ytmp){
        //             result.add(xtmp);
        //             yList.remove(Character.valueOf(xtmp));
        //             break;
        //         }
        //     }
        // }
        
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<yList.size(); i++){
            hm.put(yList.get(i),hm.getOrDefault(yList.get(i),0)+1);
        }
        
        // System.out.println(hm);
        
        
        for(int i=0; i<xList.size(); i++){
            char xtmp = xList.get(i);
            if(yList.contains(xtmp)&&hm.get(xtmp)>0){
                result.add(xtmp);
                hm.put(xtmp,hm.get(xtmp)-1);
            }
            // yList.remove(Character.valueOf(xtmp));
        }
        
        // 오름차순으로 정렬
        Collections.sort(result,(o1,o2) -> o2-o1);
        
        // answer에 합치기
        for(int i=0; i<result.size();i++) {
            sb.append(result.get(i));
        }
        answer = sb.toString();

        
        // 예외 처리
        if(answer.equals("")){
            answer = "-1";
        }
        if(answer.contains("0")){
            int tmp=0;
            for(int i=0; i<answer.length(); i++){
                if(answer.charAt(i)=='0'){
                    tmp++;
                }
                if(tmp==answer.length()){
                    answer="0";
                }
            }
        }
        
        return answer;
    }
}