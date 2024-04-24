import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n,m;
	static int[] arr;
	static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 4 2
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		
		
		dfs(0,1);
		
		System.out.println(sb);
	}
	
	static void dfs(int depth, int at) {
		if(depth==m) {
			for(int a : arr) {
				sb.append(a+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=at; i<=n; i++) {
			arr[depth] = i;
			dfs(depth+1,i+1);
		}
		
		
	}
	
}