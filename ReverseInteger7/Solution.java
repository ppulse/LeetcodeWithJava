public class Solution {
    public int reverse(int x) {
        return x < 0 ? -reversePositive(-x) : reversePositive(x);
    }
    
    public int reversePositive(int x) {
        long num = 0;
        while (x > 0) {
            num = num*10 + x%10;
            x /= 10;
        }
        
        return num > Integer.MAX_VALUE ? 0 : (int)num;
    }
}