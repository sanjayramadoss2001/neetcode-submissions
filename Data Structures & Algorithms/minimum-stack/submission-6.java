class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;
    public MinStack() {
        stack = new Stack();
        min = new Stack();
    }
    
    public void push(int val) {
        if (min.isEmpty()) {
            min.push(val);
        } else {
            if(val < min.peek()) {
                min.push(val);
            } else {
                min.push(min.peek());
            }
        }
        stack.push(val);
    }
    
    public void pop() {
        int val = stack.peek();
        if(!min.isEmpty()) {
            min.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(!min.isEmpty()) {
            return min.peek();
        }
        return -1;
    }
}
