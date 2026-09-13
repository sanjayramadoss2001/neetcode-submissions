class Node {
    int key;
    int val;
    Node next;
    Node prev;
    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        next = null;
        prev = null;
    }
}

class LRUCache {
    int size = 0;
    int capacity;
    Map<Integer, Node> map;
    Node head = null;
    Node tail = null;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public void reorder(int key) {
        Node nod = map.get(key);
        if(map.size() == 1 || tail == nod) return;
        if(head == nod) {
            head = head.next;
            head.prev = null;
			tail.prev.next = nod;
            nod.prev = tail.prev;
			nod.next = tail;
            tail.prev = nod;
        } else {
            nod.prev.next = nod.next;
            nod.next.prev = nod.prev;

            nod.prev = tail.prev;
            nod.next = tail;
            tail.prev.next = nod;
            tail.prev = nod;
        }
    }

    public int get(int key) {
        if (map.isEmpty()) return -1;
        Node res = map.get(key);
        if (res != null) reorder(key);
        return res != null ? res.val : -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            reorder(key);
            return;
        }
                if(head == null) {
            Node newVal = new Node(key, value);
            map.put(key, newVal);
            head = newVal;
            tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
            size++;
        } else {
            Node newVal = new Node(key, value);
            map.put(key, newVal);
            tail.prev.next = newVal;
            newVal.next = tail;
            newVal.prev = tail.prev;
            tail.prev = newVal;
            size++;
            if (size > capacity) {
                map.remove(head.key);
                head = head.next;
                head.prev = null;
                size--;
            }
        }
    }
}
