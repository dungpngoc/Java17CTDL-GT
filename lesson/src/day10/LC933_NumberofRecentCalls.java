package day10;

import java.util.LinkedList;
import java.util.Queue;

public class LC933_NumberofRecentCalls {
    // Tạo đối tượng queue
    private Queue<Integer> queue = new LinkedList<>();

    public int ping(int t) {
        // Mỗi lần ping thì thêm thời điểm ping vào mảng queue
        queue.add(t);
        // Loại bỏ những phần tử ko thuộc thời điểm t - 3000. Sử dụng hàm peek để lấy những phần tử đầu tiên ko thuộc t - 3000 và sử dụng hàm
        // poll để xoá
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        // dùng size để trả ra những phần tử trong khoảng t - 3000
        return queue.size();
    }
}
