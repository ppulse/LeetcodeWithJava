public class Solution {
    class Index {
        public final int first;
        public final int second;
        public Index(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return;
        
        List<Index> indexList = new ArrayList<Index>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0)
                    indexList.add(new Index(i, j)); 
            }
        }

        for (Index idx : indexList) {
            for (int i = 0; i < matrix[0].length; i++)
                matrix[idx.first][i] = 0;
            
            for (int i = 0; i < matrix.length; i++)
                matrix[i][idx.second] = 0;
        }
    }
}