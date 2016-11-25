public class Solution {
    // public int findPeakElement(int[] nums) {
    //     if (nums == null || nums.length == 0)
    //         return 0;
    //     else if (nums.length == 1)
    //         return 0;
    //     else {
    //         if (nums[0] > nums[1])
    //             return 0;
            
    //         int numsLenMinusOne = nums.length - 1;
            
    //         for (int i = 1; i < numsLenMinusOne; i++) {
    //             if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1])
    //                 return i;
    //         }
            
    //         return numsLenMinusOne;
    //     }
    // }
    // 
    
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return 0;
        else {
            if (nums[0] > nums[1])
                return 0;
            
            int numsLenMinusOne = nums.length - 1;
            
            for (int i = 1; i < numsLenMinusOne; i++) {
                if (nums[i] > nums[i + 1])
                    return i;
            }
            
            return numsLenMinusOne;
        }
    }
}