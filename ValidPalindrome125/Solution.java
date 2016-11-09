public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null)
            return false;
        if (s.length() == 0)
            return true;
        
        String sLower = s.toLowerCase();
        
        int left = 0;
        int right = sLower.length() - 1;
        
        while (left <= right) {
            while (left <= right && !((sLower.charAt(left) >= 'a' && sLower.charAt(left) <= 'z') 
                   || (sLower.charAt(left) >= '0' && sLower.charAt(left) <= '9'))) {
                left++;
            }
            
            while (left <= right && !((sLower.charAt(right) >= 'a' && sLower.charAt(right) <= 'z') 
                   || (sLower.charAt(right) >= '0' && sLower.charAt(right) <= '9'))) {
                right--;
            }
            
            if (left <= right && sLower.charAt(left) != sLower.charAt(right))
                return false;
            
            left++;
            right--;
        }
        
        return true;
    }
}