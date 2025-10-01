import java.util.*;

public class Solution {
    static int X,Y,day;
    static int[] dx,dy;

    public boolean arrayEquals(int[] a, int[] b){
        if(a.length!=b.length){
            return false;
        }
        for(int i=0; i<a.length; i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }

    public int[] solution(String[] maps) {
        int[] answer = {};
        /* 필요 자원 */
        Solution sol = new Solution();
        dx = new int[]{1,0,-1,0};
        dy = new int[]{0,1,0,-1};
        X = maps[0].length();
        Y = maps.length;
        day = 0;
        boolean[][] visited = new boolean[Y][X];
        int[][] map = new int[Y][X];

        for(int i=0;i<Y;i++){
            map[i] = maps[i].chars().map(c -> ((c > '0' && c <= '9') ? c - '0' : 0)).toArray();
        }

        List<Integer> days = new ArrayList<>();
        for(int i=0;i<Y;i++){
            for(int j=0;j<X;j++){
                if(!visited[i][j] && map[i][j]>0){
                    dfs(map, visited, j, i);
                    days.add(day);
                    day = 0;
                }
            }
        }
        if(days.isEmpty()){
            return new int[]{-1};
        }

        Collections.sort(days);
        answer = days.stream().mapToInt(d->d).toArray();

        return answer;
    }
    void dfs(int[][] map, boolean[][] visited, int x, int y){
        day += map[y][x];
        visited[y][x] = true;
        for(int i=0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx<0 || ny<0 || nx>=X || ny>=Y){
                continue;
            }

            if(!visited[ny][nx] && map[ny][nx]>0){
                dfs(map, visited, nx,ny);
            }
        }
    }
}