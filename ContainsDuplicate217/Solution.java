import java.util.Set;
import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++)
            numsSet.add(nums[i]);
        
        return !(nums.length == numsSet.size());
    }
}