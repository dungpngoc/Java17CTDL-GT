package day09;


public class MyLinkedList {
    int size;
    Node head;

    // Lấy giá trị index trong danh sách. Nếu không có trả về -1
    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        Node cur = head;
        int count = 0;
        while (cur != null) {
            if (count == index) {
                return cur.val;
            }
            count++;
            cur = cur.next;
        }

        return -1;
    }

    // Thêm vào đầu danh sách
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        size++;

    }

    // Thêm vào cuối danh sách
    public void addAtTail(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        size++;

    }

    // Thêm vào giữa
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else if (index < size) {
            Node curr = head;
            int count = 0;
            while (curr != null) {
                if (count == index - 1) {
                    Node newNode = new Node(val);
                    newNode.next = curr.next;
                    curr.next = newNode;
                    break;
                }
                count++;
                curr = curr.next;
            }
            size++;
        }
    }

    // Xoá ở vị trí index
    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
        } else if (index <  size) {
            Node curr = head;
            int count = 0;
            while (curr.next != null) {
                if (count == index - 1) {

                    curr.next = curr.next.next;
                    break;
                }
                count++;
                curr = curr.next;
            }
            size--;
        }

    }

    // Khai báo thuộc tính đối tượng
    static class Node {
        public int val;
        public Node next;

        Node(int val) {
            this.val = val;
        }
    }
}