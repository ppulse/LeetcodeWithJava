public class Solution {
    // 递归
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        
        return x == reverse(x, 0);
    }
    
    private int reverse(int x, int newValue) {
        if (x == 0)
            return newValue;
            
        return reverse(x/10, x%10 + newValue*10);
    }

    // 循环
    // public boolean isPalindrome(int x) {
    //     if (x < 0)
    //         return false;
        
    //     int newValue = 0;
    //     int originValue = x;
        
    //     while (originValue > 0) {
    //         newValue = newValue*10 + originValue%10;
    //         originValue /= 10;
    //     }
        
    //     return newValue == x;
    // }
}