public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();  
        Set<Character> charSet = new HashSet<Character>();
        
        for (int i = 0; i < p.length(); i++)
            charSet.add(p.charAt(i));
        
        int i = 0;
        while (i < s.length()) {
            int[] map = getMap(p);
            boolean matched = false;
            int cnt = 0;
            int j = i;
            
            for (; j < s.length(); j++) {
                if (map[s.charAt(j) - 'a'] > 0) {
                    map[s.charAt(j) - 'a']--;
                    cnt++;
                
                    if (cnt == p.length()) {
                        result.add(i);
                        matched = true;
                        break;
                    }
                } else if (cnt < p.length()) {
                    break;
                } 
            }
            
            if (matched) {
                i++;
            } else if (j < s.length() && charSet.contains(s.charAt(j))) {
            	i++;
            } else { 
            	if (i == j) {
                    if (charSet.contains(s.charAt(j)))
                        i = j;
                    else
                        i = j + 1;
                }
                else {
                    i = j;
                }
            }
            
        }
        
        return result;
    }
    
    private int[] getMap(String p) {
        int[] map = new int[26];
        
        for (int i = 0; i < p.length(); i++) {
            map[p.charAt(i) - 'a']++;
        }
        
        return map;
    }
}