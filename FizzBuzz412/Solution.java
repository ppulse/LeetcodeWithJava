import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<String> fizzBuzz(int n) {
        if (n <= 0)
            return null;
            
        List<String> result = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                result.add("FizzBuzz");
            else if (i % 3 == 0)
                result.add("Fizz");
            else if (i % 5 == 0)
                result.add("Buzz");
            else
                result.add(String.valueOf(i));
        }
        
        return result;
    }
}