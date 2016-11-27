public class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0)
            return Integer.MIN_VALUE;
        
        int numsLen = nums.length;
        int left = 0;
        int right = numsLen - 1;
        
        if (nums[left] == nums[right]) {
            int minValue = nums[0];
            for (int i = 1; i < numsLen; i++) {
                if (nums[i] < minValue)
                    minValue = nums[i];
            }
            
            return minValue;
        } else if (nums[left] < nums[right]) {
            return nums[left];
        } else {
            while (left + 1 < right) {
                int mid = (left + right) >> 1;
                if (nums[mid] >= nums[left]) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
            
            return nums[right];
        }
    }
}