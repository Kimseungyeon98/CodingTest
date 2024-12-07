import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
        /*
         * 로직
         */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        String result = (a*b*c)+"";
        
        for(int i=0; i<10; i++) {
        	int n = 0;
        	for(char ch : result.toCharArray()) {
        		if(Character.getNumericValue(ch)==i) {
        			n++;
        		}
        	}
        	System.out.println(n);
        }
        
        
        br.close();
	}
}