class MyHashMap {

    private int[] map;
    private boolean[] present;

    public MyHashMap() {
        map = new int[1000001];
        present = new boolean[1000001];
    }
    
    public void put(int key, int value) {
        map[key] = value;
        present[key] = true;
    }
    
    public int get(int key) {
        return present[key] ? map[key] : -1;
    }
    
    public void remove(int key) {
        present[key] = false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */