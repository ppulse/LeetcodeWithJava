public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        
        boolean[] map = new boolean[256];
        int sLen = s.length();
        int cnt = 0;
        int maxLen = 0;
        for (int i = 0; i < sLen; i++) {
            if (!map[s.charAt(i)]) {
                map[s.charAt(i)] = true;
                cnt++;
            } else {
                while (cnt > 0 && s.charAt(i-cnt) != s.charAt(i)) {
                    map[s.charAt(i-cnt)] = false;
                    cnt--;
                }
            }
            
            if (cnt > maxLen)
                maxLen = cnt;
        }
        
        return maxLen;
    }
}