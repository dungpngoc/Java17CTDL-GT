package day10;

public class MyArrayQueue {
    private static final int SIZE = 100;
    static int[] arr;
    static int head, tail;

//    private MyArrayQueue() {
//        arr = new int[SIZE];
//    }

    public static int getSize() {
        return tail - head;
        // return size of Queue
    }

    public static int getFirst() {
        return arr[head];
        // return the first element in queue
    }

    // Xoá đầu mảng
    public static int removeFirst() {
        // return the first element and return\
        int val = arr[head]; // save value
        head++; // remove
        return val;
    }

    // Thêm cuối mảng
    public static void push(int val) {
        // add a new element into queue
        arr[tail] = val;
        tail++;
    }

    private static void print() {
        for (int i = head; i < tail; i++) {
            System.out.print(arr[i] + " - ");
        }
    }

    public static void main(String[] args) {
        arr = new int[SIZE];
        push(0);
        push(1);
        push(2);
        push(3);
        print();
        System.out.println("Remove first = " + removeFirst());
        print();
        System.out.println("Remove first = " + removeFirst());
        print();

        System.out.println("Size = " + getSize());
        System.out.println("Get first = " + getFirst());
    }
}
