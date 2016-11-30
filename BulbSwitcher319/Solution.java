public class Solution {
    // public int bulbSwitch(int n) {
    //     if (n < 0)
    //         return Integer.MIN_VALUE;
            
    //     int cnt = 0;
        
    //     int value = 1;
    //     while (value * value <= n) {
    //         cnt++;
    //         value++;
    //     }
        
    //     return cnt;
    // }
    // 

    public int bulbSwitch(int n) {
        if (n < 0)
            return Integer.MIN_VALUE;

        int result = (int)Math.sqrt(n);
        
        return result;
    }
}