import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        Map<Integer, Integer> in = new HashMap<>();
        Map<Integer, Integer> out = new HashMap<>();

        int a = 0 ,b = 0 ,c = 0 ,total = 0;

        int root = 0;
        for(int[] edge : edges) {
            // 들어가는 간선 개수
            out.put(edge[0], out.getOrDefault(edge[0], 0) + 1);
            // 나가는 간선 개수
            in.put(edge[1], in.getOrDefault(edge[1], 0) + 1);
        }

        for(int n : out.keySet()) {
            if(out.get(n) > 1){
                if(!in.containsKey(n)){
                    root = n;
                } else {
                    c++;
                }
            }
        }

        total = out.get(root);

        for(int n : in.keySet()) {
            if(!out.containsKey(n)){
                b++;
            }
        }

        a = total - (b+c);

        return new int[]{root,a,b,c};
    }
}