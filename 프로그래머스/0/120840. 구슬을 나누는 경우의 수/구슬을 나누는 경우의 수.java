import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        BigInteger result = factorial(balls).divide(factorial(balls - share).multiply(factorial(share)));
        return result.intValue();
    }

    BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}