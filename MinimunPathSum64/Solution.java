public class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int[][] pathSum = new int[rowLen][colLen];
        int lastRowIdx = rowLen - 1;
        int lastColIdx = colLen - 1;
        int lastButOneRowIdx = lastRowIdx - 1;
        int lastButOneColIdx = lastColIdx - 1;

        pathSum[lastRowIdx][lastColIdx] = grid[lastRowIdx][lastColIdx];
        
        for (int row = lastRowIdx, col = lastButOneColIdx; col >= 0; col--) {
            pathSum[row][col] += pathSum[row][col+1] + grid[row][col];
        }

        for (int row = lastButOneRowIdx, col = lastColIdx; row >= 0; row--) {
            pathSum[row][col] += pathSum[row+1][col] + grid[row][col];
        }

        for (int row = lastButOneRowIdx; row >= 0; row--) {
            for (int col = lastButOneColIdx; col >= 0; col--) {
                int rowBelow = row + 1;
                int colRight = col + 1;
                int minValue = pathSum[rowBelow][col] < pathSum[row][colRight] ? pathSum[rowBelow][col] : pathSum[row][colRight];
                pathSum[row][col] += grid[row][col] + minValue;
            }
        }
        
        return pathSum[0][0];
    }
}