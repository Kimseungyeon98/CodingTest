import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        /*
         * 로직
         */
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
		
		// n 받고
		int n = sc.nextInt();
		long[] arr = new long[n];
		// n개의 long 범위의 정수를 받고
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextLong();
		}
		// 정렬하고
		Arrays.sort(arr);
		
		// m 받고
        int m = sc.nextInt();
        
        // m개의 long 범위의 정수를 받아서 arr에 있는지 확인
        fo:
        for(int i=0; i<m; i++) {
        	long num = sc.nextLong();
            
        	int start = 0;
        	int end = arr.length-1;
        	
        	while(start<=end) {
        		int middleIndex = (start+end)/2;
        		long middleValue = arr[middleIndex];
        		
        		//2. 탐색값이 중앙값보다 크면 중앙값 이후의 숫자를
        		if(num>middleValue) {
        			start = middleIndex+1;
        		} else if(num<middleValue) { // 탐색값이 중앙값보다 작으면 중앙값 이전의 숫자를
        			end = middleIndex-1;
        		} else { //	 탐색값이 중앙값이랑 같다면 반환
        			sb.append("1\n");
        			continue fo;
        		}
        	}
        	sb.append("0\n");
        }
        
		System.out.println(sb);
        sc.close();
	}
}