import java.io.*;
import java.util.StringTokenizer;
class Main {
	public static int front = 0;
	public static int back = 0;
	public static int size = 0;
	public static int[] arr = new int[2000000];
    
	public static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //횟수
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
        	st = new StringTokenizer(br.readLine()," ");
        	switch(st.nextToken()) {
        	case "push": push(Integer.parseInt(st.nextToken())); break;
        	case "pop": sb.append(pop()).append("\n"); break;
        	case "size": sb.append(size()).append("\n"); break;
        	case "empty": sb.append(empty()).append("\n"); break;
        	case "back": sb.append(back()).append("\n"); break;
        	case "front": sb.append(front()).append("\n"); break;
        	}
        }
        System.out.println(sb);
    }
    
    
    public static void push(int n) {
    	arr[back++]=n;
    	size++;
    }
    
    public static int pop() {
    	if(size>0) {
    		size--;
    		return arr[front++];
    	}else {
    		return -1;
    	}
    }
    
	public static int size() {
    	return size;
    }
	
	public static int empty() {
		if(size==0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int front() {
		if(size!=0) {
			return arr[front];
		} else {
			return -1;
		}
	}
	
	public static int back() {
    	if(size!=0) {
    		return arr[back-1];
    	}else {
    		return -1;
    	}
	}
}