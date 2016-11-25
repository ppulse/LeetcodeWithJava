public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        int colIdx = matrix[0].length - 1;
        int rowIdx = 0;
        
        while (rowIdx < matrix.length && colIdx >= 0) {
            if (matrix[rowIdx][colIdx] < target)
                rowIdx++;
            else if (matrix[rowIdx][colIdx] > target)
                colIdx--;
            else
                return true;
        }
        
        return false;
    }
}