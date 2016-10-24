public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;
        
        long result = 0;
        int sign = 0;
        int startIndex = 0;

        while (str.charAt(startIndex) == ' ')
            startIndex++;
        
        for (int i = startIndex; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            
            if (result > Integer.MAX_VALUE + 1L) {
                break;
            }
            
            if (digit <= 9 && digit >= 0) {
                result = result * 10 + digit;
            } else if (str.charAt(i) == '-' && sign == 0) {
                sign = -1;
            } else if (str.charAt(i) == '+' && sign == 0) {
                sign = 1;
            }
            else {
                break;
            }
        }
        
        int ret = 0;
        
        if (sign >= 0) {
            ret = result > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)result;
        } else {
            ret = result > Integer.MAX_VALUE + 1L ? Integer.MIN_VALUE : (int)(-result);
        }
        
        return ret;
    }
}