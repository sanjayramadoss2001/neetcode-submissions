class Pointer {
    int key;
    int val;
    Pointer(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class HashTable {
    Pointer map[];
    int size = 0;
    int capacity;

    public HashTable(int capacity) {
        this.capacity = capacity;
    }

    public void insert(int key, int value) {
        if (map == null) {
            map = new Pointer[capacity];
        }
        int index = key % capacity;
        while(true) {
            Pointer addr = map[index];
            if(addr == null) {
               map[index] = new Pointer(key, value);
               size++;
               if((double) size / capacity >= 0.5) {
                    resize();
               }
               return;
            } else if(addr.key == key) {
                addr.val = value;
                return;
            }
            index = (index + 1) % capacity;
            addr = map[index];
        }
    }

    public int get(int key) {
        if (size == 0) return -1;
        int index = key % capacity;
        Pointer res = map[index];
        while (true) {
            if (res != null && res.key == key) {
                return res.val;
            } else if (res == null) {
                break;
            }
            index = (index + 1) % capacity;
            res = map[index];
        }
        return -1;
    }

    public boolean remove(int key) {
        if(map == null) return false;
        int index = key % capacity;
        Pointer addr = map[index];
        boolean jobDone = true;
        boolean done = false;
        while(jobDone) {
            if(addr == null) {
                jobDone = false;
                break;
            }
            if(addr.key == key) {
                done = true;
                map[index] = null;
                size--;
            }
            index = (index + 1) % capacity;
            addr = map[index];            
        }
        return done;
    }


    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void resize() {
        int old = capacity;
        capacity = capacity * 2;
        Pointer[] newMap = new Pointer[capacity];
        for (int i=0; i< old; i++) {
            Pointer addr = map[i];
            if(addr == null) {
                continue;
            } else {
                int newAddr = addr.key % capacity;
                while(true) {
                    if(newMap[newAddr] == null) {
                        newMap[newAddr] = addr;
                        break;
                    }
                    newAddr = (newAddr + 1) % capacity;
                }
            }
        }
        map = newMap;
    }
}
