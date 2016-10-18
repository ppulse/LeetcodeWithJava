public class Solution {
    public String toHex(int num) {
        int idx = 7;
        
        while (idx > 0) {
            if (((num >> (idx << 2)) & 0xf) > 0) {
                break;
            }
            
            idx--;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = idx; i >= 0; i--) {
            sb.append(numToHex[((num >> (i << 2)) & 0xf)]);
        }
        
        return sb.toString();
    }
    
    private final char[] numToHex = {
        '0', '1', '2', '3', '4', '5', '6', '7', 
        '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
    };
}