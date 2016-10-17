import java.util.Map;
import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        if (s == null)
            return 0;
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int currentValue = 0;
        int result = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            if (!map.containsKey(currentChar))
                return 0;
            
            int preValue = currentValue;
            currentValue = map.get(currentChar);
            
            if (preValue > currentValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        
        return result;
    }
}