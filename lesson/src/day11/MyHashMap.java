package day11;

import java.util.LinkedList;
import java.util.List;

public class MyHashMap {
    // array of buckets
    private static final int SIZE = 10000;
    private List<Node>[] buckets;

    private Node[] b;

    public MyHashMap() {
        buckets = new List[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void put(int key, int value) {
        // biến key thành 1 index: hashFunction
        int hashIndex = hashFunction(key);

        // lấy ra bucket để chứa
        List<Node> bucket = buckets[hashIndex];
        if (bucket == null) {
            List<Node> newBucket = new LinkedList<>();
            buckets[hashIndex] = newBucket;
            bucket = newBucket;
        }
        // nếu bucket chưa có key này
        // check xem bucket có node key này chưa
        Node node = new Node(key,value);
        int indexOfKey =  bucket.indexOf(node);
        if (indexOfKey == -1) {
            // bucket chưa có key này, chỉ việc add
            bucket.add(node);
        } else {
            bucket.get(indexOfKey).value = value;
        }

//        if (bucket.contains(node)) {
//            // bucket đã chứa key này rồi
//            // ghi đè giá trị value mới
//            int indexOfKey = bucket.indexOf(node);
//            bucket.get(indexOfKey).value = value;
//        }
        // nếu bucket đã có key này
    }

    public int get(int key) {
        // Tìm hash index
        int hashIndex = hashFunction(key);
        List<Node> bucket = buckets[hashIndex];
        Node node = new Node(key, -1);
        int indexOfKey = bucket.indexOf(node);
        if (indexOfKey == -1) {
            // bucket chưa có key này, return -1
            return -1;
        } else {
            // bucket có key này, return value
            return bucket.get(indexOfKey).value;
        }
    }

    public void remove(int key) {
        int hashIndex = hashFunction(key);
        List<Node> bucket = buckets[hashIndex];
        if (bucket == null) {
            return;
        }
        Node node = new Node(key, -1);
        bucket.remove(node);
    }

    private int hashFunction (int key) {
        // SIZE = 10000
        // key = 5 -> 5
        // key = 100 -> 100
        // key = 10005 -> 5 -> collision
        // key = 10001 -> 1
        // key = 1 -> 1 -> collision
        return key % SIZE;
    }

    static class Node {
        public int key, value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return this.key == node.key;
        }
        // object 1 equal voi euqal 2 khi 2 thang cung tro den 1 object trong bo nho, cung dia chi
        // implement equal:
        //

        @Override
        public int hashCode() {
            int result = key;
            result = 31 * result + value;
            return result;
        }
    }
}
