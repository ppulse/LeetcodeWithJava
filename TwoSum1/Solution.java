public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null)
            return null;
        
        int[] numsBak = Arrays.copyOf(nums, nums.length);
        
        Arrays.sort(numsBak);
        int left = 0;
        int right = numsBak.length - 1;
        
        while (left < right) {
            int sum = numsBak[left] + numsBak[right];
            
            if (sum < target)
                left++;
            else if (sum > target)
                right--;
            else
                break;
        }
        
        int index1 = -1;
        int index2 = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == numsBak[left] && index1 == -1)
                index1 = i;
            else if (nums[i] == numsBak[right] && index2 == -1)   
                index2 = i;
        }
        
        int[] result = {index1, index2};
        
        return left == right ? null : result;
    }
}