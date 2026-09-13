class Node {
    Node prev;
    int val;
    Node next;
    public Node (int val) {
        this.val = val;
    }
}

class Deque {
    Node head;
    Node tail;
    public Deque() {
        this.head = new Node(0);
        this.tail = head;
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head.next = newNode;
            newNode.prev = head;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void appendleft(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head.next = newNode;
            newNode.prev = head;
            tail = newNode;
        } else {
            head.next.prev = newNode;
            newNode.next = head.next;
            newNode.prev = head;
            head.next = newNode;
        }
    }

    public int pop() {
        if (head == tail) return -1;
        int val = tail.val;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    public int popleft() {
        if (head == tail) return -1;
        int val = head.next.val;
        if (head.next.next != null) {
            head.next.next.prev = head;
            head.next = head.next.next;
        } else {
            head.next = null;
            tail = head;
        }
        return val;
    }
}
