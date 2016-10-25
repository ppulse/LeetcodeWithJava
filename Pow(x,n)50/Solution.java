public class Solution {
    public double myPow(double x, int n) {
        long nLong = n;
        int sign = x < 0 && (nLong & 1) == 1 ? -1 : 1;
        double calcResult = myPowAbs(Math.abs(x), Math.abs(nLong));
        
        return nLong < 0 ? sign/calcResult : sign*calcResult;
    }
    
    private double myPowAbs(double x, long n) {
        double result = 1;
        
        for (long i = n; i > 0; i >>= 1) {
            if ((i & 1) == 1)
                result *= x;
            
            x *= x;
        }
        
        return result;
    }
}