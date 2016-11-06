public class Solution {
    public String convert(String s, int numRows) {
        if (s == null || numRows == 1) {
            return s;
        }
        
        StringBuilder sb = new StringBuilder();
        
        
        
        for (int row = 0; row < numRows && row < s.length(); row++) {
            int index = row;
            int step1 = (numRows - 1 - row) * 2;
            int step2 = row * 2;
            sb.append(s.charAt(index));
            
            while (index < s.length()) {
                if (step1 > 0) {
                    index += step1;
                    if (index < s.length())
                        sb.append(s.charAt(index));
                }
                
                if (step2 > 0) {
                    index += step2;
                    if (index < s.length())
                        sb.append(s.charAt(index));
                }
            }
        }
        
        return sb.toString();
    }
}