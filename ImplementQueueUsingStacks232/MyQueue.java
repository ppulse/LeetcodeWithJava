class MyQueue {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        pushFromStack1ToStack2();

        stack2.pop();
    }

    // Get the front element.
    public int peek() {
        pushFromStack1ToStack2();
        
        return stack2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
    
    private void pushFromStack1ToStack2() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
    }
}