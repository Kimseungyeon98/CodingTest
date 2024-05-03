import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException{
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
         * ---------------------------------------------------
         */
		String[] nums = br.readLine().split(" ");
		// 입력되는 단어 갯수
		int n = Integer.parseInt(nums[0]);
		// 단어 길이 조건
		int m = Integer.parseInt(nums[1]);
		
		// 단어 빈도수 확인용 맵
		Map<String,Integer> map = new HashMap<>();
		// 입력되는 단어 갯수만큼 반복
		for(int i=0; i<n; i++) {
			// 단어를 받고
			String word = br.readLine();
			// 길이 조건 이상인 단어만 map에 담아 빈도 체크해주고
			if(word.length()>=m) {
				map.put(word, map.getOrDefault(word, 0)+1);
			}
		}
		// map에 담긴 단어들로 단어 리스트 생성
		List<String> words = new ArrayList<>(map.keySet());
		// 다중 조건을 처리하기 위해 compare을 오버라이드해주고
		Collections.sort(words,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				//1. 빈도수순
				// 빈도수가 같지 않다면
				if(Integer.compare(map.get(o1),map.get(o2))!=0) {
					// 비교한다.
					return Integer.compare(map.get(o2), map.get(o1));
				}
				
				//2. 길이순
				// 길이가 같지 않다면
				if(o1.length()!=o2.length()) {
					// 길이차이를 반환해준다.
					return o2.length() - o1.length();
				}
					
				//3. 사전순
				return o1.compareTo(o2);
			}
		});
		for(String word : words) {
			sb.append(word+"\n");
		}
		System.out.println(sb);
        /*
         * ---------------------------------------------------
         */
	}
}