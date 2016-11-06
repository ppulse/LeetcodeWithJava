public class MinStack {
    Stack<Integer> normalStack;
    Stack<Integer> minValueStack;

    /** initialize your data structure here. */
    public MinStack() {
        normalStack = new Stack<Integer>();
        minValueStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        normalStack.push(x);

        if (minValueStack.empty() || x < minValueStack.peek()) {
            minValueStack.push(x);
        } else {
            minValueStack.push(minValueStack.peek());
        }
    }
    
    public void pop() {
        normalStack.pop();
        minValueStack.pop();
    }
    
    public int top() {
        return normalStack.peek();
    }
    
    public int getMin() {
        return minValueStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */