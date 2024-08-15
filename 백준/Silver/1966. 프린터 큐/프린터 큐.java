import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			// 문서의 갯수
			int n = Integer.parseInt(st.nextToken());
			// 타겟 문서의 인덱스
			int m = Integer.parseInt(st.nextToken());
			// 문서의 중요도 배열
			Integer[] arr = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
			
			Queue q = new LinkedList();
			
			for (int j = 0; j < n; j++) {
				Doc doc = new Doc();
				doc.setIndex(j);
				doc.setRank(arr[j]);
				q.add(doc);
			}
			
			Arrays.sort(arr, Collections.reverseOrder());
			int nowIndex = 0;
			while(!q.isEmpty()) {
				Doc tmp = (Doc)q.poll();
				if(tmp.getRank()==arr[nowIndex]) {
					nowIndex++;
					if(tmp.getIndex()==m) {
						System.out.println(nowIndex);
						break;
					}
				}else {
					q.add(tmp);
				}
			}
		}
	}
}
class Doc {
	int index;
	int rank;
	@Override
	public String toString() {
		return "Doc [index=" + index + ", rank=" + rank + "]";
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}