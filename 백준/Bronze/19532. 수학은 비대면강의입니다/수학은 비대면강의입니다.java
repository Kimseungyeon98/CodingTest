import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        /*
         * 로직
         */
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        int x = ((c*e)-(b*f))/((a*e)-(b*d));
        int y = ((c*d)-(a*f))/((b*d)-(a*e));
        
        
        System.out.println(x+" "+y);
        sc.close();
	}
}