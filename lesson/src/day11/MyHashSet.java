package day11;


import java.util.LinkedList;
import java.util.List;


public class MyHashSet {
    private static final int SIZE = 10000;
    private List<Node>[] buckets;
    public MyHashSet() {
        buckets = new List[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // return hashValue ( chuyển key về hashValue) -> Coi như vị trí index
    private int hashFunction(int key) {
        return key % SIZE;
    }

    // Thêm 1 key vào Set
    public void add(int key) {
        // Tìm index
        int hashIndex = hashFunction(key);  // Băm giá trị hashValue ra (index)
        List<Node> bucket = buckets[hashIndex];     // vị trí bucket trong list buckets ( vị trí hashIndex)
        Node node = new Node(key);
        int indexOfKey = bucket.indexOf(node);
        if (indexOfKey == -1) {
            bucket.add(node);
        }
    }

    // Xoá key trong Set
    public void remove(int key) {
        int hashIndex = hashFunction(key);
        List<Node> bucket = buckets[hashIndex];
        Node node = new Node(key);
        int indexOfKey = bucket.indexOf(node);
        // index == -1 : ko tồn tại
        // index != -1 : có tồn tại
        bucket.remove(indexOfKey);
    }

    // Kiểm tra xem key đó có trong Set hay không
    public boolean contains(int key) {
        // tìm index
        int hashIndex = hashFunction(key);
        List<Node> bucket = buckets[hashIndex];
        Node node = new Node(key);
        int indexOfKey = bucket.indexOf(node);
        return indexOfKey != -1;
    }

    static class Node {
        int key;

        public Node(int key) {
            this.key = key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return key == node.key;
        }
    }
}
