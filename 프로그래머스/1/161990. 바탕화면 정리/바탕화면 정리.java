import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        // #이 존재하는 가장 낮은 x와 낮은 y
        // #이 존재하는 가장 높은 x와 높은 y
        int maxX = 0;
        int minX = 50;
        int maxY = 0;
        int minY = 50;
        List<int[]> list = new ArrayList<>();
        for(int x=0; x<wallpaper.length; x++){
            for(int y=0; y<wallpaper[x].length(); y++){
                if(wallpaper[x].charAt(y)=='#'){
                    list.add(new int[] {x,y});
                }
            }
        }
        for(int[] l : list){
            if(l[0]>maxX){
                maxX=l[0];
            }
            if(l[1]>maxY){
                maxY=l[1];
            }
            if(l[0]<minX){
                minX=l[0];
            }
            if(l[1]<minY){
                minY=l[1];
            }
        }
        int[] answer = {minX,minY,maxX+1,maxY+1};
        return answer;
    }
}