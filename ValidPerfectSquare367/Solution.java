public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num <= 0)
            return false;
        else if (num == 1)
            return true;
        
        long left = 0;
        long right = num;
        
        while (left < right) {
            long mid = (left + right) >> 1;
            long value = mid * mid;
            
            if (left == mid && value != num)
                return false;
            
            if (value > num)
                right = mid;
            else if (value < num)
                left = mid;
            else
                return true;
        }
        
        return false;
    }
}