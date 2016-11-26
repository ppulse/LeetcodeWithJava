public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 
          || obstacleGrid[0].length == 0 || obstacleGrid[0][0] == 1)
            return 0;
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int[][] result = new int[m][n];
        result[0][0] = 1;
        
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1)
                break;
            
            result[i][0] = 1;
        }
        
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == 1)
                break;
            
            result[0][i] = 1;
        }
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1)
                    result[i][j] = 0;
                else
                    result[i][j] = result[i-1][j] + result[i][j-1];
            }
        }
        
        return result[m-1][n-1];
    }
}