import java.util.Scanner;

public class Main {
	static int n,m;
	static int[] arr;
	static boolean[] visit;
	static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m];
		visit = new boolean[n];
		
		dfs(0);
		
		System.out.println(sb);
		
		sc.close();
	}
	
	static void dfs(int depth) {
		if(depth==m) {
			for(int a : arr) {
				sb.append(a+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(visit[i]==false) {
				visit[i] = true;
				arr[depth] = i+1;
				dfs(depth+1);
				visit[i] = false;
			}
		}
	}
}