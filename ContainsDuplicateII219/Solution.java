public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null)
            return false;
        
        int[] numsBak = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsBak);
        
        for (int i = 1; i < numsBak.length; i++) {
            if (numsBak[i - 1] == numsBak[i]) {
                int firstIdx = -1;
                int secondIdx = -1;
                
                for (int idx = 0; idx < nums.length; idx++) {
                    if (nums[idx] == numsBak[i]) {
                        if (firstIdx == -1) {
                            firstIdx = idx;
                        } else if (secondIdx == -1) {
                            secondIdx = idx;
                        }
                        
                        if (firstIdx != -1 && secondIdx != -1) {
                            if (secondIdx - firstIdx <= k) {
                                return true;
                            } else {
                                firstIdx = secondIdx;
                                secondIdx = -1;
                            }
                        }
                    }
                }
                
            }
        }
        
        return false;
    }
}