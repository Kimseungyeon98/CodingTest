import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
	static int[] parents;
	static List<Integer> kList;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		parents = new int[n+1];
		for(int i=1; i<n+1; i++) {
			parents[i] = i;
		}
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		kList = new ArrayList<>();
		if(N==0) {
			System.out.println(m);
			return;
		} else {
			for(int i=0; i<N; i++) {
				kList.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		List<Integer>[] partyList = new ArrayList[m];
		for(int i=0; i<m; i++) {
			partyList[i] = new ArrayList<>();
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int pn = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			
			partyList[i].add(x);
			for(int j=1; j<pn; j++) {
				int y = Integer.parseInt(st.nextToken());
				union(x,y);
				partyList[i].add(y);
			}
		}
		
		int cnt = 0;
		for(int i=0; i<m; i++) {
			boolean flag = false;
			for(int num : partyList[i]) {
				if(kList.contains(find(num))) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
	}
	
	
	static int find(int x) {
		if(parents[x]==x) {
			return x;
		}
		return find(parents[x]);
	}
	
	static void union(int x,int y) {
		int px = find(x);
		int py = find(y);
		if(kList.contains(py)) {
			int tmp = px;
			px = py;
			py = tmp;
		}
		parents[py] = px;
	}
}