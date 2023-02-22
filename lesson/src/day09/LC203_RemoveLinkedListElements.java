package day09;

class LC203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        // Nếu phần tử đầu = null thì danh sách rỗng, trả về null
        if(head == null) {
            return null;
        }

        // Nếu phần tử tiếp theo rỗng và giá trị đầu = giá trị cần xoá thì trả về null vì danh sách có mỗi 1 phần tử (sau khi xoá sẽ là null)
        if (head.next == null && head.val == val) {
            return null;
        }
        // Nếu tất cả phần tử đều = val thì sẽ xoá và gán phần tử đầu tiền = phần tử tiếp theo -> xoá đến hết.
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode curNode = head;
        while (curNode != null && curNode.next != null) {
            if (curNode.next.val == val) {
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }
        }
        return head;
    }
}

