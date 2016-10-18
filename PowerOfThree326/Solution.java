public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1)
            return false;
        
        long tmpValue = 1;
        
        while (tmpValue < n) {
            tmpValue *= 3;
        }
        
        return (int)tmpValue == n ? true : false;
    }
}