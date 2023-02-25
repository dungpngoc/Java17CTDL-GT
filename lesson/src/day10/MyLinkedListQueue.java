package day10;

public class MyLinkedListQueue {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }


    static int size;
    static Node head, tail;

    // Lấy độ dài danh sách
    public static int getSize() {
        return size;
    }

    // Lấy phần tử đầu
    public static int getFirst() {
        if (head == null) {
            return -1;
        }
        return head.val;
    }

    // Xoá đầu mảng
    public static int removeFirst() {
        int val = -1;
        if (head == null) {
            return -1;
        }
        if (head == tail) {
            val = head.val;
            head = head.next;
            tail = tail.next;
        } else {
            val = head.val;
            head = head.next;
        }
        size--;
        return val;
    }

    // Thêm cuối mảng
    public static void push(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public static boolean isEmpty() {
        return head == null;
    }

    private static void print(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        push(0);
        push(1);
        push(2);
        push(3);
        push(4);

        print(head);
        System.out.println("Remove First : " + removeFirst());
        print(head);
        System.out.println("Remove First : " + removeFirst());
        print(head);
        System.out.println("Remove First : " + removeFirst());
        print(head);
        System.out.println("Remove First : " + removeFirst());
        print(head);
        System.out.println("Remove First : " + removeFirst());
        print(head);
    }

}
