public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i < num + 1; i++) {
            result[i] = numOfBitOne(i);
        }
        
        return result;
    }
    
    private int numOfBitOne(int num) {
        int cnt = 0;
        while (num != 0) {
            num &= (num - 1);
            cnt++;
        }
        
        return cnt;
    }
}