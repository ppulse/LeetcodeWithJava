public class Solution {
    public int climbStairs(int n) {
        if (n <= 1)
            return 1;
            
        if (n == 2)
            return 2;
        
        int fnMinusTwo = 1;
        int fnMinusOne = 2;
        int fn = 0;
        
        for (int i = 3; i <= n; i++) {
            fn = fnMinusTwo + fnMinusOne;
            fnMinusTwo = fnMinusOne;
            fnMinusOne = fn;
        }
        
        return fn;
    }
}