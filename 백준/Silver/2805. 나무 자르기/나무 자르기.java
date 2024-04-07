import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        /*
         * 로직
         */
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
		
		// n:나무의 수, m:상근이가 집에 가져가려하는 나무의 길이
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        long[] arr = new long[n];
        // 배열로 나무들의 길이 받기
        for(int i=0; i<n; i++) {
        	arr[i] = sc.nextLong();
        }
        
        // 배열 정렬
        //EX) 10 15 17 20
        Arrays.sort(arr);
        
        long min = 0;
        long mid = 0;
        long max = arr[arr.length-1]+1;
        
        while(min<max) {
        	long result = 0;
        	mid = (max+min)/2;
        	for(long a: arr) {
        		if(a>mid) {
        			result += (a-mid);
        		}
        	}
        	
        	if(result<m) {
        		max = mid;
        	} else {
        		min = mid+1;
        	}
        }
        System.out.println(min-1);
        
        sc.close();
	}
}