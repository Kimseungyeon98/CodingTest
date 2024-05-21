class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        /*
         * nums 중 3개를 골라 합쳤을 때 소수가 된다면 result++ 해준다.
         */
        
        for(int i=0; i<nums.length-2; i++) {
        	for(int j=i+1; j<nums.length-1; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			int n = nums[i] + nums[j] + nums[k];
        			if(primaryNumber(n)) {
        				answer++;
        			}
        		}
        	}
        }
        
        
        return answer;
    }
    
    // 소수 공식
    public static boolean primaryNumber(int n) {
    	boolean result = true;
    	/*
    	 * 소수 판별 로직
    	 */
    	if(divisor(n)!=2) {
    		result = false;
    	}
    	return result;
    }
    
    
    // 약수 공식
	public static int divisor(int n) {
		int result = 0;
		/*
		 * 약수 구하는 로직
		 */
		if(n==1) {
			return 1;
		} else if(n==2) {
			return 2;
		} else {
			for(int i=1; i<=(int)Math.sqrt(n); i++) {
				if(n%i==0) {
					result++;
				}
			}
			
			if(n%Math.sqrt(n)==0) {
				result*=2;
				result--;
			} else {
				result*=2;
			}
		}
		return result;
	}
}