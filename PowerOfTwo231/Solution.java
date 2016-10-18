public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1)
            return false;
        
        return numOfBitOne(n) == 1;
    }
    
    private int numOfBitOne(int n) {
        int value = n;
        int cnt = 0;
        while (value != 0) {
            value &= (value - 1);
            cnt++;
        }
        
        return cnt;
    }
}