import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 로직
         */
        
        //인원 수
        int N = sc.nextInt();
        //K번째 인원 제거
        int K = sc.nextInt();
        
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
			dq.add(i+1);
		}
        
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<N; i++) {
        	for(int j=0; j<K; j++) {
        		if(j!=K-1) {
        			dq.addLast(dq.pollFirst());
        		} else {
        			list.add(dq.pollFirst());
        		}
        	}
        }
        System.out.print("<");
        for(int i=0; i<list.size(); i++) {
        	if(i!=list.size()-1) {
        		System.out.print(list.get(i)+", ");
        	}
        	else {
        		System.out.print(list.get(i));
        	}
        }
        System.out.print(">");
        
        sc.close();
	}
}