package day11;

import java.util.ArrayList;


public class MyHashSet2 {
    private final int SIZE = 1000;
    private ArrayList<Integer>[] myBuckets;

    public MyHashSet2() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    // return hashValue ( vị trí index trong buckets, chạy từ 0 -> 999)
    private int hashFunction(int key) {
        return key % SIZE;
    }

    private void add (int key) {
        int hashValueIndex = hashFunction(key);     // Nhận giá trị đã được băm
        var bucket = myBuckets[hashValueIndex];     // Tìm đến bucket trong buckets
        int keyIndex = bucket.indexOf(key);
        if (keyIndex < 0) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);     // Nhận giá trị đã được băm
        // Sau khi băm thì tìm bucket của nó
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex >= 0;
    }


    public static void main(String[] args) {
        MyHashSet2 myHashSet2 = new MyHashSet2();
        myHashSet2.add(1);
        myHashSet2.add(2);
        myHashSet2.add(3);
        myHashSet2.remove(1);
        for (int i = 0; i < 10; i++) {
            System.out.println(myHashSet2.myBuckets[i]);
        }
        System.out.println(" " + myHashSet2.contains(2));
    }
}
