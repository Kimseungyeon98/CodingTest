class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        for(int i=0; i<park.length; i++){
            if(park[i].contains("S")){
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                break;
            }
        }
        // System.out.println("시작 위치: "+answer[0] + ", " + answer[1]);
        // 주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
        // 주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
        
        //answer[1] = x
        //answer[0] = y
        
        for(String order: routes){
            String op = order.substring(0,1);
            int n = Integer.parseInt(order.substring(2,3));
            
            switch(op){
                    //동
                case "E":
                    for(int i=0; i<n; i++){
                        if(answer[1]+n<park[0].length()){
                            if(park[answer[0]].charAt(answer[1]+(i+1))!='X'){
                                if(i==n-1){
                                    answer[1]+=n;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                    //서
                case "W":
                    for(int i=0; i<n; i++){
                        if(answer[1]-n>=0){
                            if(park[answer[0]].charAt(answer[1]-(i+1))!='X'){
                                if(i==n-1){
                                    answer[1]-=n;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                    //남
                case "S":
                    for(int i=0; i<n; i++){
                        if(answer[0]+n<park[0].length()){
                            if(park[answer[0]+(i+1)].charAt(answer[1])!='X'){
                                if(i==n-1){
                                    answer[0]+=n;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                    //북
                case "N":
                    for(int i=0; i<n; i++){
                        if(answer[0]-n>=0){
                            if(park[answer[0]-(i+1)].charAt(answer[1])!='X'){
                                if(i==n-1){
                                    answer[0]-=n;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    break;
            }
            // System.out.println(answer[1] + ", " + answer[0]);
        }
        return answer;
    }
}