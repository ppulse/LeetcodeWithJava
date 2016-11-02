public class Solution {
    public boolean isValid(String s) {
        if (s == null)
            return true;
            
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (!isStackMatch(stack, '('))
                    return false;
            } else if (s.charAt(i) == ']') {
                if (!isStackMatch(stack, '['))
                    return false;
            } else if (s.charAt(i) == '}') {
                if (!isStackMatch(stack, '{'))
                    return false;
            }
        }
        
        return stack.empty();
    }
    
    private boolean isStackMatch(Stack<Character> stack, char expectedChar) {
        if (stack.empty() || stack.peek() != expectedChar) {
            return false;
        } else {
            stack.pop();
            return true;
        }
    }
}