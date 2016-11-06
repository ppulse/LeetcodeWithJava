public class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)
            return;
            
        k %= nums.length;
        
        rotate(nums, 0, nums.length - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, nums.length - 1);
    }
    
    private void rotate(int[] nums, int startIdx, int endIdx) {
        while (startIdx < endIdx) {
            int tmp = nums[startIdx];
            nums[startIdx] = nums[endIdx];
            nums[endIdx] = tmp;
            
            startIdx++;
            endIdx--;
        }
    }
}