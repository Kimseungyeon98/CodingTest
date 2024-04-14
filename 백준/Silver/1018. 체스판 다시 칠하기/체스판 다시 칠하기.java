import java.io.*;
import java.util.*;

public class Main {
    public static boolean[][] arr;
    public static int min = 64;

    public static void check(int x,int y) {
        // a,b : 시작점

        int end_x = x+8;
        int end_y = y+8;
        int cnt = 0;

        boolean ch = arr[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j <end_y ; j++) {
                if(arr[i][j]!=ch) {
                    cnt++;
                }
                ch = !ch;
            }
            ch = !ch;
        }

        // 64 - cnt : 반대의 경우
        cnt = Math.min(cnt,64-cnt);

        // 최솟값을 저장하기 위함
        min = Math.min(min,cnt);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            for (int j = 0; j < m; j++) {
                if(Character.toString(input.charAt(j)).equals("W")) {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int start_x = n-7;
        int start_y = m-7;

        for (int i = 0; i < start_x; i++) {
            for (int j = 0; j < start_y; j++) {
                check(i,j);
            }
        }
        System.out.println(min);
    }
}