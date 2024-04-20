import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        /*
         * 로직
         */
        int N = sc.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<N; i++) {
        	dq.add(i+1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++) {
        	list.add(sc.nextInt());
        }
        
        int tmp=1;
        sb.append(dq.pollFirst()).append(" ");
        for(int i=0; i<N-1; i++) {
        	int m = list.get(tmp-1);
        	if(m>0) {
        		for(int j=0; j<m; j++) {
            		if(j==m-1) {
            			tmp=dq.pollFirst();
            			sb.append(tmp).append(" ");
            		} else {
            			dq.addLast(dq.pollFirst());
            		}
            	}
        	} else {
        		for(int j=0; j<-m; j++) {
            		if(j==-m-1) {
            			tmp = dq.pollLast();
            			sb.append(tmp).append(" ");
            		} else {
            			dq.addFirst(dq.pollLast());
            		}
            	}
        	}
        }
        System.out.println(sb);
        
        sc.close();
	}
}