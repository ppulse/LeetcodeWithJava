public class Solution {
    // public void rotate(int[][] matrix) {
    //     if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length)
    //         return;
        
    //     int n = matrix.length;
        
    //     int[][] bak = Arrays.copyOf(matrix, n);
    //     for (int i = 0; i < n; i++) {
    //         bak[i] = Arrays.copyOf(matrix[i], n);
    //     }
        
        
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             matrix[i][j] = bak[n-1-j][i];
    //         }
    //     }
    // }
    
    
    //rotate in-place
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length)
            return;
        
        int endLine = matrix.length >> 1;
        int lastIndex = matrix.length - 1;
        for (int i = 0; i < endLine; i++) {
            for (int j = i; j < lastIndex-i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[lastIndex-j][i];
                matrix[lastIndex-j][i] = matrix[lastIndex-i][lastIndex-j];
                matrix[lastIndex-i][lastIndex-j] = matrix[j][lastIndex-i];
                matrix[j][lastIndex-i] = tmp;
            }
        }
    }
}