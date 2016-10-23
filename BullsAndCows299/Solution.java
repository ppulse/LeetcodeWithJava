public class Solution {
    public String getHint(String secret, String guess) {
        int[] map = new int[10];
        
        int bulls = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                map[secret.charAt(i) - '0']++;
            }
        }
        
        int cows = 0;
        for (int i = 0; i < guess.length(); i++) {
            if (secret.charAt(i) != guess.charAt(i) && map[guess.charAt(i) - '0'] > 0) {
                map[guess.charAt(i) - '0']--;
                cows++;
            }
        }
        
        return "" + bulls + "A" + cows + "B";
    }
}