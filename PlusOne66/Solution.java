public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null)
            return null;
        
        if (digits.length == 0)
            return new int[]{1};
        
        
        int idxOfLastElem = digits.length - 1;
        int carry = (digits[idxOfLastElem] + 1) / 10;
        digits[idxOfLastElem] = (digits[idxOfLastElem] + 1) % 10;
        
        for (int i = digits.length - 2; i >= 0 && carry != 0; i--) {
            int sumOfBit = digits[i] + carry;
            carry = sumOfBit / 10;
            digits[i] = sumOfBit % 10;
        }
        
        if (carry == 0) {
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            
            System.arraycopy(digits, 0, result, 1, digits.length);
            
            return result;
        }
    }
}