public class Solution {
    public String reverseVowels(String s) {
        if (s == null)
            return null;
        
        char[] chars = s.toCharArray();
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            while (left < right && !isVowel(chars[left]))
                left++;
                
            while (left < right && !isVowel(chars[right]))
                right--;

            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            
            left++;
            right--;
        }
        
        return String.valueOf(chars);
    }
    
    private boolean isVowel(char c) {
        switch (c) {
            case 'a':  // fall through
            case 'A':  // fall through
            case 'e':  // fall through
            case 'E':  // fall through
            case 'i':  // fall through
            case 'I':  // fall through
            case 'o':  // fall through
            case 'O':  // fall through
            case 'u':  // fall through
            case 'U':
                return true;
            default:
                return false;
        }
    }
}