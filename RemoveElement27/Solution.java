public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
            
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            while (left <= right && nums[left] != val)
                left++;
            
            while (left <= right && nums[right] == val)
                right--;
            
            if (left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }
        
        return left;
    }
}