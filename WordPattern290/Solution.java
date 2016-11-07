public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null)
            return false;
            
        String[] strs = str.split(" ");
        
        if (pattern.length() != strs.length) {
            return false;
        } else {
            Map<String, Character> map1 = new HashMap<String, Character>();
            Map<Character, String> map2 = new HashMap<Character, String>();

            for (int i = 0; i < pattern.length(); i++) {
                if (!map1.containsKey(strs[i]) && !map2.containsKey(pattern.charAt(i))) {
                    map1.put(strs[i], pattern.charAt(i));
                    map2.put(pattern.charAt(i), strs[i]);
                } else if (!map1.containsKey(strs[i]) || map1.get(strs[i]) != pattern.charAt(i)) {
                    return false;
                } else if (!map2.containsKey(pattern.charAt(i)) || !strs[i].equals(map2.get(pattern.charAt(i)))) {
                    return false;
                }
            }
            
            return true;
        }
    }
}