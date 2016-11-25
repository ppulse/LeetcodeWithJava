public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0)
            return result;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        subsets(nums, 0, stack, result);
        
        return result;
    }
    
    private void subsets(int[] nums, int idx, Stack<Integer> stack, List<List<Integer>> result) {
        if (idx >= nums.length) {
            List<Integer> list = new ArrayList<Integer>();
            for (int elem: stack)
                list.add(elem);
            result.add(list);
            return;
        }
        
        subsets(nums, idx + 1, stack, result);
        
        stack.push(nums[idx]);
        subsets(nums, idx + 1, stack, result);
        stack.pop();
    }
}