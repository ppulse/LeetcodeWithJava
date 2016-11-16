public class Solution {
    public int minMoves(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int smallest = nums[0];
        int biggest = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > biggest)
                biggest = nums[i];
            if (nums[i] < smallest)
                smallest = nums[i];
        }
        
        int cnt = 0;
        
        while (smallest < biggest) {
            boolean biggestFound = false;
            int addValue = biggest - smallest;
            smallest += addValue;
            cnt += addValue;
            
            int bigger = biggest;
            for (int i = 0; i < nums.length; i++) {
                if (!biggestFound && nums[i] == biggest) {
                    biggestFound = true;
                } else {
                    nums[i] += addValue;
                }
                
                if (bigger < nums[i])
                    bigger = nums[i];
            }
            if (bigger > biggest)
                biggest = bigger;
        }
        
        return cnt;
    }
}