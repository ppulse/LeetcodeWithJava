public class Solution {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int numsLen = nums.length;
        
        for (int i = 0; i < numsLen; i++) {
        	int key = nums[i];
        	int value = 1;
            if (map.containsKey(key)) {
            	value = map.get(key) + 1;
            }
            
            map.put(key, value);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        
        return -1;
    }
}