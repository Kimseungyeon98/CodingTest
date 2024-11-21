/*https://www.acmicpc.net/problem/18111

        N, M, B
        둘쩨줄 부터 N개의 줄에 각각 M개의 정수로 땅의 높이가 주어짐
        (i + 2)번째 줄의 (j + 1)번째 수는 좌표 (i, j)에서의 땅의 높이를 나타낸다. 땅의 높이는 256보다 작거나 같은 자연수 또는 0이다.

        N -> Y 축
        M -> X 축
        B -> 초기 인벤토리에 들어있는 돌의 갯수

        1. 블록을 제거해 인벤토리에 넣음 (2초)
        -> 높이 -1
        2. 인벤토리에서 블록을 꺼내 설치함 (1초)
        -> 높이 +1*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // n: y축, m: x축, b: 인벤토리에 들어있는 돌의 갯수
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        int max = 0;
        int min = 256;
        // arr에 입력 받기
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, arr[i][j]);
                min = Math.min(min, arr[i][j]);
            }
        }
        // 땅을 고르는데 걸리는 시간과 땅의 높이를 출력
        System.out.println(minecraft(arr,max,min,b));
    }

    static String minecraft(int[][] arr,int max, int min, int b){
        int result_time = Integer.MAX_VALUE;
        int result_height = Integer.MIN_VALUE;
        // 땅을 고르게 하는 작업 로직
        int tmp_b = b;
        for (int i = min; i <= max; i++) {
            int time = 0;
            b = tmp_b;
            for(int j=0; j<arr.length; j++){
                for(int k=0; k<arr[j].length; k++){
                    int cnt = arr[j][k] - i;
                    b += cnt;
                    if(cnt>0){ // 현재 목표 층고보다 높을 때 파야한다. -> 2초 b++
                        time += 2*cnt;
                    } else if(cnt<0) { // 현재 목표 층고보다 낮을 때 쌓아야한다. -> 1초 b--
                        time -= cnt;
                    }
                }
            }
            // 사용해야 하는 돌맹이가 소유한 돌맹이보다 적을 시 종료
            if(b<0){
                continue;
            }
            // 최적의 시간 및 층고 저장, 같은 결과 일 경우 더 높은 층고 저장
            if(result_time >= time){
                result_time = time;
                result_height = i;
            }
        }
        return result_time+" "+result_height;
    }
}