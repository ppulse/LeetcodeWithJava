public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int idxSlow = 0;
        int idxFaster = 0;
        
        while (idxFaster < nums.length) {
            while (idxFaster < nums.length && nums[idxSlow] == nums[idxFaster])
                idxFaster++;

            idxSlow++;
            
            if (idxFaster < nums.length)
                nums[idxSlow] = nums[idxFaster];
        }
        
        return idxSlow;
    }
}