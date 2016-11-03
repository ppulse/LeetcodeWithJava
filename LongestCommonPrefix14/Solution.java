public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null)
            return null;
        
        if (strs.length == 0)
            return "";

        String result = strs[0];
        for (int i = 1; i < strs.length; i++)
            result = commonPrefixOfTwoString(strs[i], result);
        
        return result;
    }
    
    private String commonPrefixOfTwoString(String s1, String s2) {
        int index = 0;
        
        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) != s2.charAt(index))
                break;
            
            index++;
        }
        
        return s1.substring(0, index);
    }
}