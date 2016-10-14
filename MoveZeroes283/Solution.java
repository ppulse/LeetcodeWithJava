public class Solution {
    public void moveZeroes(int[] nums) {
        int idxZero = 0;
        
        while (true) {
            while (idxZero < nums.length && nums[idxZero] != 0)
                idxZero++;
        
            int idxNonZero = idxZero + 1;
        
            while (idxNonZero < nums.length && nums[idxNonZero] == 0)
                idxNonZero++;
        
            if (idxNonZero < nums.length) {
                int tmp = nums[idxZero];
                nums[idxZero] = nums[idxNonZero];
                nums[idxNonZero] = tmp;
            } else {
                return;
            }
        
        }
        
    }
}