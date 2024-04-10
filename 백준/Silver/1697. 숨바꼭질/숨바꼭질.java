import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
        // bfs의 depth를 표현할 cnt
		int cnt = 0;
        // 방문여부를 판단할 boolean 배열
		boolean[] visit = new boolean[100001];
		// 각 depth의 노드를 저장해둘 queue
		Queue<Integer> q = new LinkedList<>();
        // 시작 노드 추가
		q.add(n);
		// 만약 입력된 n과 k가 같다면 바로 0출력 후 종료
		if(k==n) {
			System.out.println("0");
			return;
		}
		
        // -1 +1 *2
		while(true) {
			cnt++;
			// 반복문에서 q의 사이즈가 변동되기 때문에 정의해둬야함
			int size = q.size();
			// 1-> 3-> 9 -> 27 ''' 반복하며 current가 k가 될 때까지 반복함
			for(int i=0; i<size; i++) {
                // 저장된 노드들을 하나씩 꺼내어 current에 저장
				int current = q.poll();
				visit[current] = true;
				// 다음 current가 k가 되면 해당 depth 출력
				if(current-1==k || current+1==k || current*2==k) {
					System.out.println(cnt);
					return;
				}

				if(current-1>=0 && !visit[current-1]) {
					q.add(current-1);
					visit[current-1] = true;
				}
				if(current+1<=100000 && !visit[current+1]) {
					q.add(current+1);
					visit[current+1] = true;
				}
				if(current*2<=100000 && !visit[current*2]) {
					q.add(current*2);
					visit[current*2] = true;
				}
			}
		}
	}
}