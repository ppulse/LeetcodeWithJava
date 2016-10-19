public class Solution {
    public boolean isHappy(int n) {
        if (n < 0)
            return false;

        while (n >= 10) {
            n = sumOfTheSquaresOfDigits(n);
        }
        
        return resultWithinTen[n];
    }
    
    private boolean[] resultWithinTen = {false, true, false, false, false, false, false, true, false, false};
    
    private int sumOfTheSquaresOfDigits(int n) {
        int result = 0;
        
        while (n > 0) {
            int remainder = n % 10;
            result += remainder * remainder;
            n /= 10;
        }
        
        return result;
    }
}