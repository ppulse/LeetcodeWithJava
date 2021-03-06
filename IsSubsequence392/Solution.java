public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null && t == null)
            return true;
        else if (s == null || t == null)
            return false;
        
        int idxOfS = 0;
        int tLen = t.length();
        int sLen = s.length();
        
        for (int idxOfT = 0; idxOfT < tLen && idxOfS < sLen; idxOfT++) {
            if (s.charAt(idxOfS) == t.charAt(idxOfT))
                idxOfS++;
        }
        
        return idxOfS == sLen;
    }
}