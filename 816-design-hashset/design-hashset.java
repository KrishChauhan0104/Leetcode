class MyHashSet {
    private final int SIZE = 769;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[SIZE];
        for(int i=0; i<SIZE; i++){
            buckets[i] = new LinkedList<>();
        }
    }
    private int hash(int key){
        return key % SIZE;
    }
    
    public void add(int key) {
        int index = hash(key);
        if(!buckets[index].contains(key)){
            buckets[index].add(key);
        }
    }

    
    public void remove(int key) {
        int index = hash(key);
        buckets[index].removeFirstOccurrence(key);
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        return buckets[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */