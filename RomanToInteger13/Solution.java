
public class Solution {
    public int romanToInt(String s) {
        if (s == null)
            return 0;

        int currentValue = 0;
        int result = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);

            int preValue = currentValue;
            switch (currentChar) {
                case 'I': 
                    currentValue = 1;
                    break;
                case 'V': 
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L': 
                    currentValue = 50;
                    break;
                case 'C': 
                    currentValue = 100;
                    break;
                case 'D': 
                    currentValue = 500;
                    break;
                case 'M': 
                    currentValue = 1000;
                    break;
                default: 
                    return 0;
            }
            
            if (preValue > currentValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        
        return result;
    }
}