package day11;

import java.util.ArrayList;

public class MyHashMap2 {

    private class Data {
        int key;
        int value;

        // Tạo 1 đối tượng có vị trí key và giá trị value để add , remove , put
        public Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data = (Data) o;
            return key == data.key;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
    private final int SIZE = 1000;
    private ArrayList<Data>[] myBuckets;


    public MyHashMap2() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int hashValueIndex = hashFunction(key); // Nhận giá trị đã được băm
        var bucket = myBuckets[hashValueIndex];
        Data newData = new Data(key,value);
        int keyIndex = bucket.indexOf(newData);
        if (keyIndex >= 0) {
            bucket.get(keyIndex).value = value;
        } else {
            bucket.add(newData);
        }
    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data myDeleteData = new Data(key,0);
        bucket.remove(myDeleteData);
    }

    public int get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data findData = new Data(key,0);
        int keyIndex = bucket.indexOf(findData);
        if (keyIndex >= 0) {
            return bucket.get(keyIndex).value;
        }
        return -1;
    }

    public static void main(String[] args) {
        MyHashMap2 myHashMap2 = new MyHashMap2();
        myHashMap2.put(1,1);
        myHashMap2.put(1,2);
        myHashMap2.put(10,3);

        myHashMap2.remove(1);
        System.out.println(" " + myHashMap2.get(10));
        for (int i = 0; i < 20; i++) {
            System.out.println(myHashMap2.myBuckets[i]);
        }
    }
}
