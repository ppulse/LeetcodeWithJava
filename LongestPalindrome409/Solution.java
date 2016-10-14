public class Solution {
    public int longestPalindrome(String s) {
        int[] map = new int[256];
        for (int i = 0; i < s.length(); i++)
            map[s.charAt(i)]++;
        
        boolean addOne = false;
        int len = 0;
        for (int i = 0; i < map.length; i++) {
            if ((map[i] & 1) == 1)
                addOne = true;
            
            if (map[i] >= 2)
                len += (map[i] >> 1) << 1;
        }
        
        return addOne ? len + 1 : len;
    }
}