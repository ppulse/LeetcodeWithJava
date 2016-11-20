public class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 1)
            return 1;
        
        long[] uglyNumbers = new long[n + 1];
        uglyNumbers[1] = 1;
        
        int multiply_2 = 1;
        int multiply_3 = 1;
        int multiply_5 = 1;
        
        long minimunNumber = 1;
        int cnt = 1;
        while (++cnt <= n) {
            long resultMultiPle2 = uglyNumbers[multiply_2] * 2;
            long resultMultiPle3 = uglyNumbers[multiply_3] * 3;
            long resultMultiPle5 = uglyNumbers[multiply_5] * 5;
            
            uglyNumbers[cnt] = getMinimunNumber(resultMultiPle2, resultMultiPle3, resultMultiPle5);
            
            if (uglyNumbers[cnt] == resultMultiPle2) {
                multiply_2++;
            }
            
            if (uglyNumbers[cnt] == resultMultiPle3) {
                multiply_3++;
            }
            
            if (uglyNumbers[cnt] == resultMultiPle5) {
                multiply_5++;
            }
        }
        
        return (int)uglyNumbers[n];
    }
    
    private final long getMinimunNumber(long a, long b, long c) {
        long smallBetweenAAndB = a < b ? a : b;
        return smallBetweenAAndB < c ? smallBetweenAAndB : c;
    }
}