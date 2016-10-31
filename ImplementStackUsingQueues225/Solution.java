class MyStack {
    private Queue<Integer> queue1 = new LinkedList<Integer>();
    private Queue<Integer> queue2 = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        Queue<Integer> notEmptyQueue = null;
        
        if (queue1.isEmpty()) {
            notEmptyQueue = queue2;
        } else {
            notEmptyQueue = queue1;
        }
        
        notEmptyQueue.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        Queue<Integer> emptyQueue = null;
        Queue<Integer> notEmptyQueue = null;
        
        if (queue1.isEmpty()) {
            emptyQueue = queue1;
            notEmptyQueue = queue2;
        } else {
            emptyQueue = queue2;
            notEmptyQueue = queue1;
        }
        
        while (notEmptyQueue.size() > 1) {
            emptyQueue.offer(notEmptyQueue.poll());
        }
        
        notEmptyQueue.poll();
    }

    // Get the top element.
    public int top() {
        Queue<Integer> emptyQueue = null;
        Queue<Integer> notEmptyQueue = null;
        if (queue1.isEmpty()) {
            emptyQueue = queue1;
            notEmptyQueue = queue2;
        } else {
            emptyQueue = queue2;
            notEmptyQueue = queue1;
        }
        
        while (notEmptyQueue.size() > 1) {
            emptyQueue.offer(notEmptyQueue.poll());
        }
        int result = notEmptyQueue.poll();
        emptyQueue.offer(result);
        
        return result;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}