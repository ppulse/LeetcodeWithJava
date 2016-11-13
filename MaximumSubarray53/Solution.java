public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int sum = nums[0];
        int maxSum = sum;
        
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        
        return maxSum;
    }
}