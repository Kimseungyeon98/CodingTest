import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Main {
	static int cnt;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 한 변의 길이 : 2^N
		int N = Integer.parseInt(st.nextToken());
		// r행 c열
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		cnt = 0;
		int n = (int)Math.pow(2, N);
		
		dfs(c,r,n);
		
		
	}
	static void dfs(int c, int r,int size) {
		size = size/2;
		
		if(size==0) {
			System.out.println(cnt);
			return;
		}
		if(size>c && size>r) {
			dfs(c,r,size);
		} else if(size<=c && size>r) {
			cnt+=(size*size);
			dfs(c-size,r,size);
		} else if(size>c && size<=r) {
			cnt+=(size*size)*2;
			dfs(c,r-size,size);
		} else if(size<=c && size<=r) {
			cnt+=(size*size)*3;
			dfs(c-size,r-size,size);
		}
		
	}
}