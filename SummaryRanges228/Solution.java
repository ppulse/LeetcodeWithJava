public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        if (nums == null)
            return result;
        
        int idx = 0;
        while (idx < nums.length) {
            int startIdx = idx;
            int endIdx = idx;
            
            while (idx < nums.length - 1 && nums[idx] + 1 == nums[idx + 1]) {
                endIdx++;
                idx++;
            }
            
            String s;
            if (endIdx > startIdx) {
                s = "" + nums[startIdx] + "->" + nums[endIdx];
            } else {
                s = "" + nums[startIdx];
            }
            
            result.add(s);
            
            if (idx == nums.length - 1)
                break;
            else
                idx++;
        }
        
        return result;
    }
}