import java.util.*;
import java.util.Map.Entry;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        // choices[0]~choinces[2] : 앞에 점수 3~1점
        // choices[3] = 둘 다 0점
        // choices[4]~choices[6] : 뒤에 점수 1~3점
        
        // survey[i] = "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA" 중 하나
        
        Map<String,Integer> result = new HashMap<>();
        for(int i=0; i<survey.length; i++){
            int score = choices[i];
            String name = survey[i];
            String front = name.charAt(0)+"";
            String back = name.charAt(1)+"";
            
            
            if(score>0&&score<4){
                if(score == 1){
                    result.put(front,result.getOrDefault(front,0)+3);
                } else if(score == 2){
                    result.put(front,result.getOrDefault(front,0)+2);
                } else {
                    result.put(front,result.getOrDefault(front,0)+1);
                }
                
            } else if(score==4){
                
            } else {
                if(score == 5){
                    result.put(back,result.getOrDefault(back,0)+1);
                } else if(score==6){
                    result.put(back,result.getOrDefault(back,0)+2);
                } else {
                    result.put(back,result.getOrDefault(back,0)+3);
                }
                
            }
        }
        
        // 각 점수 별 이름 붙이기
        
        // RT
        if(result.get("R")!=null&&result.get("T")!=null){
            if(result.get("R")>=result.get("T")){
                answer+="R";
            } else {
                answer+="T";
            }
        } else if(result.get("R")!=null&&result.get("T")==null){
            answer+="R";
        } else if(result.get("R")==null&&result.get("T")!=null) {
            answer+="T";
        } else {
            answer+="R";
        }
        
        // CF
        if(result.get("C")!=null&&result.get("F")!=null){
            if(result.get("C")>=result.get("F")){
                answer+="C";
            } else {
                answer+="F";
            }
        } else if(result.get("C")!=null&&result.get("F")==null){
            answer+="C";
        } else if(result.get("C")==null&&result.get("F")!=null) {
            answer+="F";
        } else {
            answer+="C";
        }
        
        // JM
        if(result.get("J")!=null&&result.get("M")!=null){
            if(result.get("J")>=result.get("M")){
                answer+="J";
            } else {
                answer+="M";
            }
        } else if(result.get("J")!=null&&result.get("M")==null){
            answer+="J";
        } else if(result.get("J")==null&&result.get("M")!=null) {
            answer+="M";
        } else {
            answer+="J";
        }
        
        // AN
        if(result.get("A")!=null&&result.get("N")!=null){
            if(result.get("A")>=result.get("N")){
                answer+="A";
            } else {
                answer+="N";
            }
        } else if(result.get("A")!=null&&result.get("N")==null){
            answer+="A";
        } else if(result.get("A")==null&&result.get("N")!=null) {
            answer+="N";
        } else {
            answer+="A";
        }
        
        return answer;
    }
    
}