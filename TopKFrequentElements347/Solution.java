public class Solution {
    class Pair implements Comparable<Pair> {
        public int key;
        public int value;
        public Pair(int k, int v) {
            key = k;
            value = v;
        }
        
        public int compareTo(Pair other) {
            if (value < other.value)
                return 1;
            
            if (value > other.value)
                return -1;
            
            return 0;
        }
    }
    
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<Integer>();

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int numsLen = nums.length;
        for (int i = 0; i < numsLen; i++) {
            int value = 1;
            int key = nums[i];
            
            if (map.containsKey(key)) {
                value += map.get(nums[i]);
            }
            
            map.put(key, value);
        }
        
        List<Pair> ls = new ArrayList<Pair>();
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ls.add(new Pair(entry.getKey(), entry.getValue()));
        }
        
        Collections.sort(ls);
        
        for (int i = 0; i < k; i++)
            result.add(ls.get(i).key);
            
        return result;
    }
}