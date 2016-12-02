public class Solution {
    public String decodeString(String s) {
        if (s == null)
            return "";
        
        int sLen = s.length();
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        
        while (idx < sLen) {
        	int idxOfFirstLetter = idx;
            while (idx < sLen && !(s.charAt(idx) >= '0' && s.charAt(idx) <= '9')) {
                idx++;
            }
        
            int idxOfFirstDigit = idx;
            while (idx < sLen && s.charAt(idx) != '[') {
                idx++;
            }
        
            sb.append(s.substring(idxOfFirstLetter, idxOfFirstDigit));
            if (idx < sLen) { 
                int factor = Integer.valueOf(s.substring(idxOfFirstDigit, idx));
        
                idx++;
        
                int startIdx = idx;
                int cnt = 0;
                while (idx < sLen && (s.charAt(idx) != ']' || cnt > 0)) {
                    if (s.charAt(idx) == '[')
                        cnt++;
                    if (s.charAt(idx) == ']')
                        cnt--;
                    idx++;
                }      
        
                String subStr = decodeString(s.substring(startIdx, idx));    
            
                for (int i = 0; i < factor; i++) {
                    sb.append(subStr);
                }
            
                idx++;
            }
        }
        
        return sb.toString();
    }
}