import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
		
        /*
         * ---------------------------------------------------
         */
		
		
        
        //수의 갯수
        int n = sc.nextInt();
        
        //구해야하는 합의 갯수
        int m = sc.nextInt();
        
        int[] arr = new int[n+1];
        int[] sumArr = new int[n+1];
        int sum = 0;
        for(int i=1; i<n+1; i++) {
        	arr[i] = sc.nextInt();
        	sum += arr[i];
        	sumArr[i] = sum;
        }
        
        
        for(int i=0; i<m; i++) {
        	int firstIndex = sc.nextInt();
        	int lastIndex = sc.nextInt();
        	System.out.println(sumArr[lastIndex] - sumArr[firstIndex-1]);
        }
        
        
        // 5 4 3 2 1
        // 1 3 : 12
        // 2 4 : 9
        // 5 5 : 1
        
        // 5 4 3 -> sum[3] - sum[0]
        // 4 3 2 -> sum[4] - sum[1]
        // 1  	 -> sum[5] - sum[4]
        
        
        
        /*
         * ---------------------------------------------------
         */
        sc.close();
	}
}