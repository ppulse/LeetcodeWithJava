public class Solution {
    public String addStrings(String num1, String num2) {
        if ("".equals(num1))
            return num2;
        
        if ("".equals(num2))
            return num1;
        
        int loopTimes = Math.max(num1.length(), num2.length()) + 1;
        int resultLength = loopTimes;
        char[] result = new char[loopTimes];
        
        int carry = 0;
        int num1Index = num1.length() - 1;
        int num2Index = num2.length() - 1;
        int operandA = num1.charAt(num1Index--) - '0';
        int operandB = num2.charAt(num2Index--) - '0';
        
        while (loopTimes-- > 0) {
            int bitSum = (operandA + operandB + carry);
            
            result[loopTimes] = (char)(bitSum % 10 + '0');
            
            carry = bitSum / 10;
            
            if (num1Index < 0) {
                operandA = 0;
            } else {
                operandA = num1.charAt(num1Index--) - '0';
            }
            
            if (num2Index < 0) {
                operandB = 0;
            } else {
                operandB = num2.charAt(num2Index--) - '0';
            }
        }
        
        int idx = 0;
        
        while (idx < resultLength - 1 && result[idx] == '0')
            idx++;
        
        StringBuilder sb = new StringBuilder();
        while (idx < resultLength) {
            sb.append(result[idx++]);
        }    
        
        return sb.toString();
    }
}
