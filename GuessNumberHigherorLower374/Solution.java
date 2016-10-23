/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if (n < 1)
            return 1;
        
        int left = 1;
        long right = n;
        
        while (left <= right) {
            int mid = (int)((left + right) >> 1);
            int guessResult = guess(mid);
            
            if (guessResult < 0) {
                right = mid - 1;
            } else if (guessResult > 0) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        
        return left;
    }
}