public class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        
        for (int i = 1; i < n; i++)
            isPrime[i] = true;
        
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                long k = i;
                while (i * k < n) {
                    isPrime[(int)(i * k)] = false;
                    k++;
                }
            }
        }
        
        int result = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i])
                result++;
        }
        
        return result;
    }
}