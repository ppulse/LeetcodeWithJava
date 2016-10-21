public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
            
        if (nums.length == 1)
            return nums[0];
        
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        
        int fMinusTwo = nums[0];
        int fMinusOne = Math.max(nums[0], nums[1]);
        int fn = 0;
        
        for (int i = 2; i < nums.length; i++) {
            fn = Math.max(nums[i] + fMinusTwo, fMinusOne);
            fMinusTwo = fMinusOne;
            fMinusOne = fn;
        }
            
        return fn;
    }
}