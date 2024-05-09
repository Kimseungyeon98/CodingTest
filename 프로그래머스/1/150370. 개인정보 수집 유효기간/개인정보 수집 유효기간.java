import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] date = today.split("[.]");
        
        Map<String,Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<terms.length; i++){
            hm.put(terms[i].substring(0,1),Integer.parseInt(terms[i].substring(2)));
        }
        
        String[][] privacy = new String[privacies.length][];
        
        for(int i=0; i<privacies.length; i++){
            privacy[i] = privacies[i].split(" ");
        }
        
        for(int i=0; i<privacies.length; i++){
            String da = privacy[i][0];
            String p = privacy[i][1];
            String[] d = da.split("\\.");
            d[1] = (Integer.parseInt(d[1]) + hm.get(p))+"";
            do{
                if(Integer.parseInt(d[1])>12){
                    d[0] = (Integer.parseInt(d[0])+1)+"";
                    d[1] = (Integer.parseInt(d[1])-12)+"";
                }
            } while(Integer.parseInt(d[1])>12);
            
            // System.out.println(Arrays.toString(d)+","+Arrays.toString(date));
            
            //년도가 더 작다면
            if(Integer.parseInt(d[0])<Integer.parseInt(date[0])){      
                list.add(i+1);
            }
            // 년도가 같다면
            else if(Integer.parseInt(d[0])==Integer.parseInt(date[0])){
                // 월이 더 작다면
                if (Integer.parseInt(d[1])<Integer.parseInt(date[1])){
                    list.add(i+1);
                }
                // 월이 같다면
                else if(Integer.parseInt(d[1])==Integer.parseInt(date[1])){
                    // 일이 작거나 같다면
                    if(Integer.parseInt(d[2])<=Integer.parseInt(date[2])){
                        list.add(i+1);
                    }
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}