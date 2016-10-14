public class Solution {
    public int getSum(int a, int b) {
        int aTmp = a;
        int bTmp = b;
        
        int xorResult = aTmp ^ bTmp;
        int carry = (aTmp & bTmp) << 1;
        
        while (carry != 0) {
            aTmp = xorResult;
            bTmp = carry;
            xorResult = aTmp ^ bTmp;
            carry = (aTmp & bTmp) << 1;
        }
        
        
        return xorResult; 
    }
}