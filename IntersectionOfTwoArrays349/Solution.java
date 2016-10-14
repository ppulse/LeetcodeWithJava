import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++)
            set1.add(nums1[i]);
        
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++)
            set2.add(nums2[i]);
        
        List<Integer> list = new ArrayList<Integer>();
        Iterator<Integer> iter = set1.iterator();
        
        while (iter.hasNext()) {
            int val = iter.next();
            if (set2.contains(val))
                list.add(val);
        }
        
        int[] ret = new int[list.size()];
        int i = 0;
        for (int val : list)
            ret[i++] = val;
        
        return ret;
    }
}