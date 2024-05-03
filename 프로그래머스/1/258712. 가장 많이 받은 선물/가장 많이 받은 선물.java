import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        // 친구들 인덱스
        Map<String,Integer> indexMap = new HashMap<>();
        for(int i=0; i<friends.length; i++){
            indexMap.put(friends[i],i);
        }
        // 친구들 서로 주고 받은 선물
        int[][] getgiveArr = new int[friends.length][friends.length];
        
        for(int i=0; i<gifts.length; i++){
            String giver = gifts[i].split(" ")[0];
            String getter = gifts[i].split(" ")[1];
            getgiveArr[indexMap.get(giver)][indexMap.get(getter)]++;
        }
        
        //"0: 인덱스, 1: 준 선물, 2: 받은 선물, 3: 선물 지수, 4: 받은 선물"
        int[][] getgiverankArr = new int[friends.length][5];
        for(int i=0; i<getgiverankArr.length; i++){
            getgiverankArr[i][0] = i;
            for(int j=0; j<getgiveArr[i].length; j++){
                getgiverankArr[i][1] += getgiveArr[i][j];
            }
            for(int j=0; j<getgiveArr[i].length; j++){
                getgiverankArr[i][2] += getgiveArr[j][i];
            }
            getgiverankArr[i][3] = getgiverankArr[i][1] - getgiverankArr[i][2];
        }
        
        // getgiveArr : 2차열 배열로 서로 주고 받은 선물의 갯수를 저장
        // getgiverankArr : 2차원 배열로 각 사람의 {인덱스, 준 선물, 받은 선물, 선물 지수, 받은 선물} 이 들어가 있음
        
        // 선물을 주고 받은 갯수를 비교해서 '받은 선물' 을 올린다
        // 만약 주고 받은 선물 갯수가 같거나 기록이 없다면 선물 지수가 더 큰 사람이 선물을 받는다.
        
        for(int i=0; i<getgiveArr.length;i++){
            for(int j=0; j<getgiveArr.length;j++){
                if(i!=j){
                    if(getgiveArr[i][j]>getgiveArr[j][i]){
                        getgiverankArr[i][4]++;
                    } else if(getgiveArr[i][j]==getgiveArr[j][i]){
                        if(getgiverankArr[i][3]>getgiverankArr[j][3]){
                            getgiverankArr[i][4]++;
                        }
                    }
                }
            }
        }
        
        for(int i=0; i<getgiverankArr.length; i++){
            if(answer<getgiverankArr[i][4]){
                answer=getgiverankArr[i][4];
            }
        }
        
        return answer;
    }
}