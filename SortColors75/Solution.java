public class Solution {
    public void sortColors(int[] nums) {
        if (nums == null)
            return;
        
        int left = 0;
        int right = nums.length - 1;
        
        //step one
        int idxFirstOne = sort(nums, left, right, 0);
        
        //step two
        right = nums.length - 1;
        sort(nums, idxFirstOne, right, 1);
    }
    
    private final int sort(int nums[], int left, int right, int pivot) {
        while (left < right) {
            while (left < right && nums[left] == pivot) {
                left++;
            }
            
            while (left < right && nums[right] != pivot) {
                right--;
            }
            
            if (left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }
        
        return left;
    }
}