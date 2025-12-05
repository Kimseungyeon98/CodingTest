import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    //5 17
    //bfs로 작은놈 기준 넣어보기
    //방법은 총 3가지
    //2배하거나 -1하거나 +1 하거나
    //단, 2배 시 가중치 0
    static class Level{
        int cur;
        int depth;
        Level(int cur, int depth){
            this.cur = cur;
            this.depth = depth;
        }
    }
    static Queue<Level> queue = new LinkedList<>();
    static boolean[] visited = new boolean[100001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        queue.add(new Level(a,0));
        visited[a] = true;

        while(!queue.isEmpty()){
            Level level = queue.poll();
            if(level.cur == b){
                System.out.println(level.depth);
                break;
            }

            //2배
            if(level.cur*2<100001 && !visited[level.cur*2]){
                queue.add(new Level(level.cur*2,level.depth));
                visited[level.cur*2]  = true;
            }

            //-1
            if(level.cur>0 && !visited[level.cur-1]) {
                queue.add(new Level(level.cur - 1, level.depth + 1));
                visited[level.cur - 1] = true;
            }
            //+1
            if(level.cur+1<100001 && !visited[level.cur+1]) {
                queue.add(new Level(level.cur + 1, level.depth + 1));
                visited[level.cur + 1] = true;
            }

        }
    }
}
