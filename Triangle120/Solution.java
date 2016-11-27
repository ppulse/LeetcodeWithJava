public class Solution {
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     if (triangle == null || triangle.size() == 0)
    //         return 0;
        
    //     int size = triangle.size();
    //     int[] sum = new int[size];
        
    //     List<Integer> lastList = triangle.get(size - 1);
        
    //     int idx = 0;
    //     for (int val : lastList) {
    //         sum[idx++] = val;
    //     }
        
    //     for (int i = size - 2; i >= 0; i--) {
    //         List<Integer> ls = triangle.get(i);
    //         int lsSize = ls.size();
    //         for (int j = 0; j < lsSize; j++) {
    //             int minValue = sum[j] < sum[j+1] ? sum[j] : sum[j+1];
    //             sum[j] = ls.get(j) + minValue; 
    //         }
    //     }
        
    //     return sum[0];
    // }

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0)
            return 0;
        
        int size = triangle.size();
        int[] sum = new int[size+1];
        
        List<Integer> lastList = triangle.get(size - 1);
        
        for (int i = size - 1; i >= 0; i--) {
            List<Integer> ls = triangle.get(i);
            int lsSize = ls.size();
            for (int j = 0; j < lsSize; j++) {
                int minValue = sum[j] < sum[j+1] ? sum[j] : sum[j+1];
                sum[j] = ls.get(j) + minValue; 
            }
        }
        
        return sum[0];
    }
}