import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        /*
         * ---------------------------------------------------
         */
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		int startIndex = 0;
		int sum = 0;
		int max=0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			// 처음 합
			if(i==k-1) {
				for(int j=startIndex; j<=i; j++) {
					sum += arr[j];
				}
				// 최댓값 초기화
				max = sum;
			} else if(i>k-1) { // 처음 합 이후 하나씩 밀기
				sum -= arr[startIndex];
				startIndex++;
				sum += arr[i];
				
				// 최댓값
				if(max<sum) {
					max = sum;
				}
			}
		}
		
        System.out.println(max);
        
        /*
         * ---------------------------------------------------
         */
        sc.close();
	}
}