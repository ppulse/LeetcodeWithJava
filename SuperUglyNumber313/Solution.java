public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if (n <= 0 || primes == null || primes.length == 0)
            return 0;
        
        int k = primes.length;
        int[] multiplesIdx = new int[k];
        int[] product = new int[k];
        for (int i = 0; i < k; i++) {
            multiplesIdx[i] = 1;
            product[i] = primes[i];
        }
        
        int[] result = new int[n + 1];
        result[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            int minValue = product[0];
            for (int j = 1; j < k; j++) {
                int value = product[j];
                if (value < minValue)
                    minValue = value;
            }
            
            result[i] = minValue;
            
            for (int j = 0; j < k; j++) {
                if (product[j] == minValue) {
                    multiplesIdx[j]++;
                    product[j] = primes[j] * result[multiplesIdx[j]];
                }
            }
        }
        
        return result[n];
    }
}