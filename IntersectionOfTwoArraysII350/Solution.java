import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arrayForCache;
        int[] arrayForLoop;
        
        if (nums1.length < nums2.length) {
            arrayForCache = nums1;
            arrayForLoop = nums2;
        } else {
            arrayForCache = nums2;
            arrayForLoop = nums1;
        }
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < arrayForCache.length; i++) {
            if (map.containsKey(arrayForCache[i]))
                map.put(arrayForCache[i], map.get(arrayForCache[i]) + 1);
            else
                map.put(arrayForCache[i], 1);
        }
        
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < arrayForLoop.length; i++) {
            if (map.containsKey(arrayForLoop[i])) {
                resultList.add(arrayForLoop[i]);
                int valueCnt = map.get(arrayForLoop[i]) - 1;
                if (valueCnt < 1) {
                    map.remove(arrayForLoop[i]);
                } else {
                    map.put(arrayForLoop[i], valueCnt);
                }
            }
        }
        
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++)
            result[i] = resultList.get(i);
        
        return result;
    }
}