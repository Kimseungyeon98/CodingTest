class Solution {
    public int solution(int n, int w, int num) {
        int h = (int) Math.ceil((double) n / w);
        int[][] arr = new int[h][w];
        int tmp = 1;
        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) { // 왼쪽 -> 오른쪽
                for (int j = 0; j < w && tmp <= n; j++) {
                    arr[i][j] = tmp++;
                }
            } else { // 오른쪽 -> 왼쪽
                for (int j = w-1; j >= 0 && tmp <= n; j--) {
                    arr[i][j] = tmp++;
                }
            }
        }

        int targetRow = -1, targetCol = -1;
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (arr[i][j] == num) {
                    targetRow = i;
                    targetCol = j;
                    break;
                }
            }
            if (targetRow != -1) break;
        }

        int count = 0;
        for (int i = h - 1; i >= targetRow; i--) {
            if (arr[i][targetCol] != 0) count++;
        }
        
        return count;
    }
}