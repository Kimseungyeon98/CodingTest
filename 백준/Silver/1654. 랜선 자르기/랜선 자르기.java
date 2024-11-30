import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        /*
         * 로직
         */
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
		
		//k,n 입력
        int k = sc.nextInt();
        int n = sc.nextInt();
        
        long[] kArr = new long[k];
        for(int i=0; i<k; i++) {
        	kArr[i] = sc.nextInt();
        }
        //이분탐색을 위한 정렬
        Arrays.sort(kArr);
        
        // kArr을 result로 나눈값을 모두 더햇을 때 n이 되는 가장 큰 result를 구해라
        long max = kArr[kArr.length-1]+1;
        long min = 0;
        
        while(min<max) {
        	long mid = (max+min)/2;
        	int result = 0;
        	for(int i=0; i<kArr.length; i++) {
	        	result+=kArr[i]/mid;
	        }
        	
	        if(result<n) {
	        	max=mid;
	        } else {
	        	min=mid+1;
	        }
        }
        System.out.println(min-1);
        
        sc.close();
	}
}