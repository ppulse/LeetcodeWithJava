public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = (left + right) >> 1;
            
            if (nums[left] < nums[right]) {
                if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (nums[mid] < target) {
                    if (nums[mid] < nums[left]) {
                        if (nums[left] < target) {
                            right = mid - 1;
                        } else if (nums[left] > target) {
                            left = mid + 1;
                        } else {
                            return left;
                        }
                    } else {
                        left = mid + 1;
                    }
                } else if (nums[mid] > target) {
                    if (nums[mid] < nums[left]) {
                        right = mid - 1;
                    } else {
                        if (nums[left] < target) {
                            right = mid - 1;
                        } else if (nums[left] > target) {
                            left = mid + 1;
                        } else {
                            return left;
                        }
                    }
                } else {
                    return mid;
                }
            }
        }
        
        return -1;
    }
}