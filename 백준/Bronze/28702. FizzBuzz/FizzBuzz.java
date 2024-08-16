import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		Queue<String> q = new LinkedList<>();
		q.add(br.readLine());
		q.add(br.readLine());
		q.add(br.readLine());
		int i = 0;
		for(String t : q) {
			try {
				i = Integer.parseInt(t)-3;
			} catch(NumberFormatException e) {
			}
		}
		
		boolean flag = false;
		
		Queue<String> tmp = new LinkedList<>();
		while(true) {
			if(tmp.size()>=3) {
				tmp.poll();
			}
			if(i%3==0&&i%5==0) {
				tmp.add("FizzBuzz");
			} else if(i%3==0&&i%5!=0) {
				tmp.add("Fizz");
			} else if(i%3!=0&&i%5==0) {
				tmp.add("Buzz");
			} else {
				tmp.add(String.valueOf(i));
			}
			if(flag) {
				tmp.poll();
				tmp.poll();
				System.out.println(tmp.peek());
				break;
			}
			if(tmp.equals(q)) {
				flag = true;
			}
			i++;
		}
	}
}