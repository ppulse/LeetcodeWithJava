import java.util.Set;
import java.util.HashSet;

public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1)
            return false;
        
        long tmpValue = 1;
        
        while (tmpValue < n) {
            tmpValue *= 3;
        }
        
        return (int)tmpValue == n;
    }
    
    // without using any loop / recursion
    // public boolean isPowerOfThree(int n) {
    //     Set<Integer> cache = new HashSet<Integer>();
    //     cache.add(1);
    // 	cache.add(3);
    // 	cache.add(9);
    // 	cache.add(27);
    // 	cache.add(81);
    // 	cache.add(243);
    // 	cache.add(729);
    // 	cache.add(2187);
    // 	cache.add(6561);
    // 	cache.add(19683);
    // 	cache.add(59049);
    // 	cache.add(177147);
    // 	cache.add(531441);
    // 	cache.add(1594323);
    // 	cache.add(4782969);
    // 	cache.add(14348907);
    // 	cache.add(43046721);
    // 	cache.add(129140163);
    // 	cache.add(387420489);
    // 	cache.add(1162261467);
        
    // 	return cache.contains(n);
    // }
}