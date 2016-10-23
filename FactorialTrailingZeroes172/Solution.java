public class Solution {
    public int trailingZeroes(int n) {
        if (n < 0)
            return 0;
        
        int numOfFive = 0; 
        
        while (n > 0) {
            numOfFive += n / 5;
            n /= 5;
        }
        
        return numOfFive;
    }
}