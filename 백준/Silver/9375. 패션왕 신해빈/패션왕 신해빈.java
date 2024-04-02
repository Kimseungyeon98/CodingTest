import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<n ; i++) {
			int m = Integer.parseInt(br.readLine());
			Map<String,ArrayList<String>> map = new HashMap<>();
			int result = 1;
			for(int j=0; j<m ; j++) {
				st = new StringTokenizer(br.readLine());
				String itemName = st.nextToken();
				String itemType = st.nextToken();
				if(map.containsKey(itemType)) {
					map.get(itemType).add(itemName);
				} else {
					map.put(itemType, new ArrayList<>());
					map.get(itemType).add(itemName);
				}
			}
			for(String key : map.keySet()) {
				result*=map.get(key).size()+1;
			}
			System.out.println(result-1);
		}
		
		br.close();
	}
}