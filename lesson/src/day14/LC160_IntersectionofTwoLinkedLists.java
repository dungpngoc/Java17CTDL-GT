package day14;


import java.util.ArrayList;
import java.util.HashSet;

public class LC160_IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();    // Tạo mảng HashSet để chứa các node
        // Thêm lần lượt các node từ ListNode A vào set trước
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }

        while(headB != null){
            if(set.contains(headB)){        // Duyệt lần lượt ListNode B, nếu set chứa node B thì return luôn headB là điểm giao nhau
                return headB;
            }else{
                headB = headB.next;         // Nếu ko ta kiểm tra tiếp
            }
        }
        return null;                        // Ko có điểm giao nhau sẽ return null
    }
    // Độ phức tạp: 1 + O(a + b), a là độ dài ListNode A, b là độ dài ListNode B
}
