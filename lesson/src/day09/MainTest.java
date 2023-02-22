package day09;

public class MainTest {
    public static void main(String[] args) {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printLinkList(n1);
        printLinkList(n3);

        addToHead(n0, 2);
        // Thêm vào đầu mảng
//        n0 = addToHead(n0,5);
//        printLinkList(n0);
        // Thêm vào cuối
//        n0 = addToTail(n0,6);
//        printLinkList(n0);
        // Thêm vào giữa
//        addToIndex(n0,6,2);
//        printLinkList(n0);

        // Xoá ở đầu
//        n0 = removeAtHead(n0);
//        printLinkList(n0);

        // Xoá ở cuối
//        n0 = removeAtTail(n0);
//        printLinkList(n0);

        // Xoá ở vị trí index
        n0 = removeAtIndex(n0,2);
        printLinkList(n0);
    }

    // Thêm phần tử vào đầu
    private static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    // Thêm phần tử vào cuối
    private static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            // B1. Xác định lastNode
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            // B2. gán lastNode.next = newNode
            lastNode.next = newNode;
        }
        return headNode;
    }

    // Thêm phần tử vào giữa
    private static Node addToIndex(Node headNode, int value, int index) {
        if (index == 0) {
            return addToHead(headNode, value);
        } else {
            // B1. Tìm vị trí cần thêm
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while (curNode != null) {
                count++;
                if (count == index) {
                    // Thực hiện add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                }
                curNode = curNode.next;
            }
        }
        return headNode;
    }

    // Xoá phần tử ở đầu
    private static Node removeAtHead(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    // Xoá ở cuối
    private static Node removeAtTail(Node headNode) {
        if (headNode == null) {
            return null;
        }
        // B1, Xác định last và previous
        Node lastNode = headNode;
        Node prevNode = null;
        while (lastNode.next != null) { // lastNode.next = null
            prevNode = lastNode;
            lastNode = lastNode.next;
        }

        if (prevNode == null) {
            return null;
        } else {
            prevNode.next = lastNode.next;
        }
        return headNode;
    }

    // Xoá phần tử ở giữa
    private static Node removeAtIndex(Node headNode, int index) {
        if(headNode == null || index < 0) {
            return null;
        }
        if (index == 0) {
            return removeAtHead(headNode);
        }
        Node curNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean bIsFound = false;
        while (curNode.next != null) {
            if (count == index) {
                // Xoá ở vị trí curNode
                bIsFound = true;
                break;
            }
            prevNode = curNode;
            curNode = curNode.next;
            count++;
        }

        // Remove cur
        if (bIsFound) {
            if (prevNode == null) {
                return null;
            } else {
                if (curNode != null) {
                    prevNode.next = curNode.next;
                }
            }
        }
        return headNode;
    }

    // In ra
    private static void printLinkList(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    // Tạo 1 phần tử Node bao gồm value và next( gán giá trị tiếp theo)
    static class Node {
        public int value;
        public Node next;

        Node(int val) {
            this.value = val;
        }
    }
}
