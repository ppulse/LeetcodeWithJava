public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return result;
        
        int m = matrix.length;
        int n = matrix[0].length;
        int halfM = (m + 1) >> 1;
        int halfN = (n + 1) >> 1;
        int half = halfM < halfN ? halfM : halfN;
        
        for (int i = 0; i < half; i++) {
            for (int row = i, col = i; col < n-i; col++) {
                result.add(matrix[row][col]);
            }
            
            for (int row = i+1, col = n-i-1; row < m-i; row++) {
                result.add(matrix[row][col]);
            }
            
            for (int row = m-i-1, col = n-i-2; col >= i && row > i; col--) {
                result.add(matrix[row][col]);
            }
            
            for (int row = m-i-2, col = i; row > i && col < n-i-1; row--) {
                result.add(matrix[row][col]);
            }
        }
        
        return result;
    }
}