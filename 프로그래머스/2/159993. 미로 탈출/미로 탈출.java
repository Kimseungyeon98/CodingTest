import java.util.*;

public class Solution {
    static int X, Y;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    
    /*
    S : 시작 지점
    E : 출구
    L : 레버
    O : 통로
    X : 벽
    */

    static int sx, sy, ex, ey, rx, ry, value;

    public int solution(String[] maps) {
        X = maps[0].length();
        Y = maps.length;

        int sx = -1, sy = -1; // 시작 지점
        int ex = -1, ey = -1; // 출구
        int lx = -1, ly = -1; // 레버

        // 좌표 찾기
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                char c = maps[i].charAt(j);
                if (c == 'S') {
                    sx = j; sy = i;
                } else if (c == 'E') {
                    ex = j; ey = i;
                } else if (c == 'L') {
                    lx = j; ly = i;
                }
            }
        }

        // BFS로 최단거리 구하기
        int dist1 = bfs(maps, sx, sy, lx, ly); // S → L
        int dist2 = bfs(maps, lx, ly, ex, ey); // L → E

        if (dist1 == -1 || dist2 == -1) return -1;
        return dist1 + dist2;
    }

    // BFS: 최단 거리 구하기
    int bfs(String[] maps, int sx, int sy, int ex, int ey) {
        if (sx == -1 || sy == -1 || ex == -1 || ey == -1) return -1;

        boolean[][] visited = new boolean[Y][X];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sx, sy, 0});
        visited[sy][sx] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], d = cur[2];

            if (x == ex && y == ey) return d; // 도착

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= X || ny >= Y) continue;
                if (visited[ny][nx]) continue;
                if (maps[ny].charAt(nx) == 'X') continue; // 벽

                visited[ny][nx] = true;
                q.add(new int[]{nx, ny, d + 1});
            }
        }
        return -1; // 도달 불가
    }
}