import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
	static List<Integer> list = new ArrayList<>();
	static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
         * 로직
         */
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			if(order.equals("all")) {
				all();
			} else if(order.equals("empty")){
				empty();
			}
			if(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				
				if(order.equals("add")) {
					add(num);
				} else if(order.equals("remove")) {
					remove(num);
				} else if(order.equals("check")) {
					check(num);
				} else if(order.equals("toggle")) {
					toggle(num);
				}
			}
		}
		System.out.println(sb);
		br.close();
	}
	
	public static void add(int n){
		if(!list.contains(n)) {
			list.add(n);
		}
	}
	public static void remove(int n){
		if(list.contains(n)) {
			list.remove(Integer.valueOf(n));
		}
	}
	public static void check(int n){
		if(list.contains(n)) {
			sb.append("1\n");
		} else {
			sb.append("0\n");
		}
	}
	public static void toggle(int n){
		if(list.contains(n)) {
			remove(n);
		} else {
			add(n);
		}
	}
	public static void all(){
		empty();
		for(int i=1; i<=20  ; i++) {
			list.add(i);
		}
	}
	public static void empty(){
		for(int i=list.size()-1; i>=0 ; i--) {
			list.remove(i);
		}
	}
}