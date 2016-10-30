public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0)
            return resultList;
        
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        
        Arrays.sort(sortedNums);
        
        int length = nums.length;
        
        for (int i = 0; i < length && sortedNums[i] <= 0; i++) {
            int expectedSum = -sortedNums[i];
            int left = i + 1;
            int right = length - 1;
            
            while (left < right) {
                long currentSum = sortedNums[left] + sortedNums[right];
                if (currentSum < expectedSum)
                    left++;
                else if (currentSum > expectedSum)
                    right--;
                else {
                    List<Integer> indexList = 
                        searchValInOrgArray(nums, sortedNums[i], sortedNums[left], sortedNums[right]);
                    
                    resultList.add(indexList);
                    left++;
                    right--;
                }
            }
        }
        
        Set<List<Integer>> resultSet = new HashSet(resultList);
        List<List<Integer>> result = new ArrayList<List<Integer>>(resultSet);
        
        return result;
    }
    
    private List<Integer> searchValInOrgArray(int[] nums, int firstVal, int secondVal, int thirdVal) {
        List<Integer> result = new ArrayList<Integer>();

        int firstIndex = -1;
        int secondIndex = -1;
        int thirdIndex = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == firstVal && firstIndex == -1) 
                firstIndex = i;
            else if (nums[i] == secondVal && secondIndex == -1)
                secondIndex = i;
            else if (nums[i] == thirdVal && thirdIndex == -1)
                thirdIndex = i;
        }
        
        result.add(nums[firstIndex]);
        result.add(nums[secondIndex]);
        result.add(nums[thirdIndex]);
        
        return result;
    }
}