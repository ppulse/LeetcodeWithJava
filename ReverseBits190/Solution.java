public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        
        for (int i = 0; i < 16; i++) {
            int j = 31 - i;
            int gap = j - i;
            
            result += (n & (1 << i)) << gap;
            result += (n & (1 << j)) >>> gap;
        }
        
        return result;
    }
}