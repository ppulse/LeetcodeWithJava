public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        int rowIdx = 0;
        int colsNum = matrix[0].length;
        int rowsNum = matrix.length;
        
        while (rowIdx < rowsNum && matrix[rowIdx][colsNum - 1] < target)
            rowIdx++;
        
        if (rowIdx == rowsNum)
            return false;
        
        int left = 0;
        int right = colsNum - 1;
        
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (matrix[rowIdx][mid] < target)
                left = mid + 1;
            else if (matrix[rowIdx][mid] > target)
                right = mid - 1;
            else
                return true;
        }
        
        return false;
    }
}