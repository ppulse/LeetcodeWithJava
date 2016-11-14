public class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<Integer>();
        if (n <= 0)
            return result;
        
        Stack<Integer> stack = new Stack();
        stack.push(1);
        
        while (!stack.empty()) {
            int value = stack.pop();
            
            while (value <= n) {
                if (value%10 <= 8 && value+1 <= n)
                    stack.push(value + 1);
                    
                result.add(value);
                value *= 10;
            }
        }
        
        return result;
    }
}