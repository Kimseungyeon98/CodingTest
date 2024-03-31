import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		/*
         * 로직
         */
	
		st = new StringTokenizer(br.readLine());
		
		//저장된 사이트 주소의 수
		int n = Integer.parseInt(st.nextToken());
		//비밀번호를 찾으려는 사이트 주소의 수
		int m = Integer.parseInt(st.nextToken());
		
		//사이트:비밀번호
		Map<String,String> hm = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			hm.put(st.nextToken(), st.nextToken());
		}
		
		for(int i=0; i<m; i++) {
			sb.append(hm.get(br.readLine())+"\n");
		}

		System.out.println(sb);
		br.close();
	}
}