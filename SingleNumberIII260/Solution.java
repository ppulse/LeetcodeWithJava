public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        if (nums == null || nums.length == 0)
            return result;
        
        int xorResult = nums[0];
        for (int i = 1; i < nums.length; i++)
            xorResult ^= nums[i];
        
        int partitionNum = xorResult & (xorResult ^ (xorResult - 1));
        List<List<Integer>> twoParts = partition(nums, partitionNum);
        result[0] = singleNumberOneValue(twoParts.get(0));
        result[1] = singleNumberOneValue(twoParts.get(1));
        
        return result;
    }
    
    private List<List<Integer>> partition(int[] nums, int partitionNum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> partOne = new ArrayList<Integer>();
        List<Integer> partTwo = new ArrayList<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & partitionNum) == 0)
                partOne.add(nums[i]);
            else
                partTwo.add(nums[i]);
        }
        
        result.add(partOne);
        result.add(partTwo);
        
        return result;
    }
    
    private int singleNumberOneValue(List<Integer> nums) {
        int result = 0;
        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext())
            result ^= iter.next();
        return result;
    }
}