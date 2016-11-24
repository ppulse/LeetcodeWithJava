public class Solution {
    public int mySqrt(int x) {
        if (x < 0)
            return -1;
        else if (x == 0)
            return 0;
        
        long left = 1;
        long right = x;
        
        while (left < right) {
            long mid = (left + right) >> 1;
            long val = mid * mid;
            
            if (val > x) {
                right = mid;
            } else if (val < x && mid > left) {
                left = mid;
            } else {
                return (int)mid;
            }
        }
        
        return (int)left;
    }
}