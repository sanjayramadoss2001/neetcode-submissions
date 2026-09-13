class Node {
    int val;
    Node next;
    Node prev;
    Node(int val) {
        this.val = val;
    }
}

class MyStack {
    Node head;
    Node tail;
    public MyStack() {
        Node node = new Node(0);
        head = tail = node;
    }
    
    public void push(int x) {
        Node newVal = new Node(x); 
        if (head == tail) {
            head.next = newVal;
            newVal.prev = head;
            tail = newVal;
        } else {
            newVal.prev = tail;
            tail.next = newVal;
            tail = newVal;
        }
    }
    
    public int pop() {
        if (head != tail) {
            int val = tail.val;
            tail = tail.prev;
            tail.next = null;
            return val;
        }
        return -1;
    }
    
    public int top() {
        if (head != tail) {
            return tail.val;
        }
        return -1;
    }
    
    public boolean empty() {
        if (head == tail) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */