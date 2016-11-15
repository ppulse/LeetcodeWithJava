public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        if (nums == null || nums.length == 0)
            return result;
        
        int xorResult = nums[0];
        for (int i = 1; i < nums.length; i++)
            xorResult ^= nums[i];
        
        int partitionNum = xorResult & (xorResult ^ (xorResult - 1));
        
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & partitionNum) == 0)
                result[0] ^= nums[i];
            else
                result[1] ^= nums[i];
        }
        
        return result;
    }
}