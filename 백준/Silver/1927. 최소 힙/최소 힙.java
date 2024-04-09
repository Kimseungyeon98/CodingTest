import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		 
		PriorityQueue<Long> pq = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
			Long num = Long.parseLong(br.readLine());
			if(num.equals(0L)) {
				if(pq.size()==0) {
					sb.append("0\n");
					continue;
				}
				sb.append(pq.poll()+"\n");
			} else {
				pq.add(num);
			}
		}
		System.out.println(sb);
		
		br.close();
	}
}