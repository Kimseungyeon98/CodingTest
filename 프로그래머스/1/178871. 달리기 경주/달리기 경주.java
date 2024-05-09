import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        Map<String,Integer> rankingMap = new HashMap<>();
        for(int i=0; i<players.length; i++){
            rankingMap.put(players[i],i);
        }
        
        for(String call : callings){
            String nowName = call;
            int nowRank = rankingMap.get(nowName);

            String frontName = players[nowRank-1];
            int frontRank = rankingMap.get(frontName);

            rankingMap.put(nowName,frontRank);
            rankingMap.put(frontName,nowRank);

            players[frontRank] = nowName;
            players[nowRank] = frontName;

        }
        
        answer =players;
        return answer;
    }
}