import java.util.*;

class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         * 로직
         */
        HashSet<String> hm = new HashSet<>();
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
        	String name = sc.next();
        	String state = sc.next();
        	if(state.equals("enter")) {
        		hm.add(name);
        	} else {
        		hm.remove(name);
        	}
        }
        
        List<String> list = new ArrayList<>();
        for(String name : hm) {
        	list.add(name);
        }
        Collections.sort(list,Collections.reverseOrder());
        for(String s: list) {
        	System.out.println(s);
        }
        
        
        sc.close();
	}
}