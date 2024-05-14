import java.util.ArrayList;
import java.util.List;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
//         char[] sArr = s.toCharArray();
//         for(int i=0; i<sArr.length; i++){
//             int tmp=0;
//             for(int j=1; j<=index; j++){
//                 sArr[i] = Character.toChars(sArr[i]+1)[0];
                
//                 if(skip.contains(sArr[i]+"")){
//                     sArr[i] = Character.toChars(sArr[i]+1)[0];
//                 }
                
                
//                 if(sArr[i]>122){
//                     sArr[i]= Character.toChars(sArr[i]-26)[0];
//                 }
                
//             }
//             answer+=sArr[i]+"";
//         }
        int sNum = 0;
        int skipNum = 0;
        int tmp = 0;
        
        List<Integer> skipList = new ArrayList<>();
        
        
        for(int i=0; i<skip.length(); i++){
            skipNum = skip.charAt(i)+0;
            skipList.add(skipNum);
        }
        
        for(int i=0; i<s.length();i++){
            sNum = s.charAt(i)+0;
            for(int j=0; j<index; j++){
                sNum++;
                if(sNum>122){
                    sNum-=26;
                }
                if(skipList.contains(sNum)){
                    do{
                        sNum++;
                        if(sNum>122){
                            sNum-=26;
                        }
                    }while(skipList.contains(sNum));
                }
                
                
            }
            answer+=(char)sNum+"";
        }
        
        return answer;
    }
}