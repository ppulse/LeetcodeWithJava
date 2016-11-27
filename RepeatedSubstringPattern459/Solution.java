public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        if (str == null)
            return false;
        
        if (str.length() <= 1)
            return false;
        
        int strLen = str.length();
        int halfStrLen = strLen >> 1;
        int sameCharIdx = 1;
        
        while (sameCharIdx <= halfStrLen) {
            if (str.charAt(sameCharIdx) == str.charAt(0)) {
                if (repeatedSubstringPattern(str, sameCharIdx))
                    return true;
            }
            
            sameCharIdx++;
        }
        
        return false;
    }
    
    private boolean repeatedSubstringPattern(String str, int sameCharIdx) {
        String subStr = str.substring(0, sameCharIdx);
        int subStrLen = subStr.length();
        int strLen = str.length();
        
        if (strLen % subStrLen == 0) {
            int repeatedTimes = strLen / subStrLen;
            
            StringBuilder sb = new StringBuilder(strLen);
            for (int i = 0; i < repeatedTimes; i++) {
                sb.append(subStr);
            }
                
            if (str.equals(sb.toString()))
                return true;
        }
        
        return false;
    }
}