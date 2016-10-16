
public class Solution {
    public int majorityElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        while (true) {
            int index = partition(nums, low, high);
            
            if (index == nums.length / 2)
                return nums[index];
            else if (index > nums.length / 2)
                high = index - 1;
            else
                low = index + 1;
        }
    }
    
    private int partition(int[] nums, int low, int high) {
        int pivotIdx = (int)(Math.random() * (high - low + 1)) + low;
        int pivot = nums[pivotIdx];
        nums[pivotIdx] = nums[low];
        
        int lowIdx = low;
        int highIdx = high;
        
        while (lowIdx < highIdx) {
            while (lowIdx < highIdx && nums[highIdx] >= pivot)
                highIdx--;
            
            nums[lowIdx] = nums[highIdx];
            
            
            while (lowIdx < highIdx && nums[lowIdx] <= pivot)
                lowIdx++;
            
            nums[highIdx] = nums[lowIdx];
        }
        
        nums[lowIdx] = pivot;
        return lowIdx;
    }    
}