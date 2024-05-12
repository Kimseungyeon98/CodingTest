import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        List<int[]> list = new ArrayList<>();
        
        for(int i=0; i<data.length;i++){
            switch(ext){
                case "code":
                    if(data[i][0]<val_ext){
                        list.add(data[i]);
                    }
                    break;
                case "date":
                    if(data[i][1]<val_ext){
                        list.add(data[i]);
                    }
                    break;
                case "maximum":
                    if(data[i][2]<val_ext){
                        list.add(data[i]);
                    }
                    break;
                case "remain":
                    if(data[i][3]<val_ext){
                        list.add(data[i]);
                    }
                    break;
            }
        }

        
        switch(sort_by){
                case "code":
                    list.sort(Comparator.comparingInt(arr -> arr[0]));
                    break;
                case "date":
                    list.sort(Comparator.comparingInt(arr -> arr[1]));
                    break;
                case "maximum":
                    list.sort(Comparator.comparingInt(arr -> arr[2]));
                    break;
                case "remain":
                    list.sort(Comparator.comparingInt(arr -> arr[3]));
                    break;
            }
        
        
        int[][] answer = new int[list.size()][];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}