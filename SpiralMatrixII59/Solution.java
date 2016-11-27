public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        if (n <= 0)
            return result;
        
        int half = (n + 1) >> 1;
        
        int value = 1;
        for (int i = 0; i < half; i++) {
            for (int row = i, col = i; col < n - i; col++) {
                result[row][col] = value;
                value++;
            }
            
            for (int row = i+1, col = n-i-1; row < n-i; row++) {
                result[row][col] = value;
                value++;
            }
            
            for (int row = n-i-1, col = n-i-2; col >= i; col--) {
                result[row][col] = value;
                value++;
            }
            
            for (int row = n-i-2, col = i; row > i; row--) {
                result[row][col] = value;
                value++;
            }
        }
        
        return result;
    }
}