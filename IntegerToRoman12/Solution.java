public class Solution {
    public String intToRoman(int num) {
        if (num < 1 || num > 3999)
            return "";
        
        String[] map = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        int[] divisor = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int idx = 0;
        int mapSize = map.length;
        
        while (idx < mapSize) {
            int cnt = num / divisor[idx];
            num %= divisor[idx];
            
            for (int i = 0; i < cnt; i++)
                sb.append(map[idx]);
            
            idx++;
        }
        
        return sb.toString();
    }
}