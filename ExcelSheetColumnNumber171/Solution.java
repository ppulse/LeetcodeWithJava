public class Solution {
    public int titleToNumber(String s) {
        int columnNum = 0;
        for (int i = 0; i < s.length(); i++) {
            columnNum = columnNum * 26 + (s.charAt(i) - 'A' + 1);
        }
        
        return columnNum;
    }
}