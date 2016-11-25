public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null && t == null)
            return true;
        else if (s == null || t == null)
            return false;
        
        int idxOfS = 0;
        for (int idxOfT = 0; idxOfT < t.length() && idxOfS < s.length(); idxOfT++) {
            if (s.charAt(idxOfS) == t.charAt(idxOfT))
                idxOfS++;
        }
        
        return idxOfS == s.length();
    }
}