package day11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        // Duyệt mảng nums
        for (int i = 0; i < nums.length; i++) {
            int minus = target - nums[i];  // Tạo biến minus là hiệu 2 số target và nums thứ i
            if (set.contains(minus)) {      // Nếu trong set có chứa minus thì duyệt lại mảng nums điều kiện là những số đã được duyệt ( j < i)
                for (int j = 0; j < i; j++) {
                    if (nums[j] == minus) {     // Nếu num[j] == minus thì trả về mảng vị trí thoả mãn ta cần tìm
                        return new int[]{j, i};
                    }
                }
            }
            set.add(nums[i]);   // Nếu không có minus thì ta thêm vào set rồi duyệt lại cho đến khi tìm được số thoả mãn
        }
        throw new RuntimeException("Không tìm thấy cặp thoả mãn");  // Trong quá trình chạy mà không tìm thấy thì sẽ trả ra ngoại lệ
    }
}
