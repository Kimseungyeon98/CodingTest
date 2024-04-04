import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine(),"-");
		StringTokenizer st2;
		String tmp = "";
		List<Integer> list = new ArrayList<>();
		while(st1.hasMoreTokens()) {
			int sum = 0;
			tmp = st1.nextToken();
			st2 = new StringTokenizer(tmp,"+");
			while(st2.hasMoreTokens()) {
				sum+=Integer.parseInt(st2.nextToken());
			}
			list.add(sum);
		}
		
		int result = list.get(0);
		if(list.size()!=1) {
			for(int i=1; i<list.size(); i++) {
				result-=list.get(i);
			}
		}
		System.out.println(result);
		
		br.close();
	}
}