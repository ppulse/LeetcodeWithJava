public class Solution {
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int expectedSum = (nums.length + 1) * nums.length / 2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];
        
        return expectedSum - sum;
    }
}