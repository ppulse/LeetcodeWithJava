public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int slowIdx = 0;
        int fastIdx = 0;
        int cnt = 0;
        
        int idx = 0;
        while (fastIdx < nums.length) {
            while (fastIdx < nums.length && nums[slowIdx] == nums[fastIdx]) {
                fastIdx++;
            }
            
            if (slowIdx != fastIdx - 1) {
                nums[idx++] = nums[slowIdx];
                nums[idx++] = nums[fastIdx - 1];
                cnt += 2;
                
                slowIdx = fastIdx;
            } else {
                nums[idx++] = nums[slowIdx];
                slowIdx = fastIdx;
                cnt++;
            }
        }
        
        return cnt;
    }
}