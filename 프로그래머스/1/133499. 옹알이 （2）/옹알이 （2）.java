import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bas = {"aya","ye","woo","ma"};
        

        
        for(String bab : babbling){
            List<String> basics = new ArrayList<>(Arrays.asList(bas));
            String beforeSub = "";
            int tmp = 0;
            for(int i=0; i<bab.length(); i++){
                String sub = bab.substring(tmp,i+1);
                if(basics.contains(sub)&&!beforeSub.equals(sub)){
                    tmp+=sub.length();
                    beforeSub = sub;
                }
            }
            if(tmp==bab.length()){
                answer++;
            }
        }
    
        return answer;
    }
}