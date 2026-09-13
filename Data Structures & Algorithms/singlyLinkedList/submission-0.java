class LinkNode {
    int val;
    LinkNode next;

    LinkNode(int val) {
        this(val, null);
    }
    LinkNode(int val, LinkNode next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
    LinkNode head;
    LinkNode tail;
    public LinkedList() {
        this.head = new LinkNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        int i = 0;
        LinkNode curr = head.next;
        while (curr != null && i < index) {
            curr = curr.next;
            i++;
        }
        if (curr == null) return -1;
        return curr.val;
    }

    public void insertHead(int val) {
        LinkNode newNode = new LinkNode(val);
        if (head == tail){
            head.next = tail = newNode;
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
    }

    public void insertTail(int val) {
        LinkNode newNode = new LinkNode(val);
        if (head == tail) {
            head.next = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public boolean remove(int index) {
        int i = 0;
        LinkNode curr = head;
        while (curr.next != null && i < index) {
            curr = curr.next;
            i++;
        }
        if (curr.next == null) return false;
        curr.next = curr.next.next;
        if (curr.next == null) tail = curr;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        LinkNode curr = head.next;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        return list;
    }
}
