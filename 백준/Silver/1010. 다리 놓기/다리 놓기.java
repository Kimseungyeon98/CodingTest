import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException{
        /*
         * 로직
         */
		Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i=0; i<t ; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			//mCn
			long result = 1;
			long up = 1;
			long down = 1;
			
			for(int j=1;j<=n;j++) {
				up *= m--;
				down *= j;
				if(up%down==0) {
					up/=down;
					down/=down;
				}
			}
			System.out.println(up/down);
			
		}
        
        
        sc.close();
	}
}