package day05;

public class LC69_Sqrtx {
    //    public int mySqrt(int x) {
    // Cách 1
//        if (x == 0) return 0;
//        int left = 1, right = x;
//        while (true) {
//            int mid = left + (right - left) / 2;
//            if (mid > x / mid) {
//                right = mid - 1;
//            } else {
//                if (mid + 1 > x / (mid + 1))
//                    return mid;
//                left = mid + 1;
//            }
//        }
//    }
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;     // mid^2 = x
            } else if (mid < x / mid) {
                left = mid + 1; // mid chưa đủ lớn -> cần check ở range nhỏ hơn
            } else {
                right = mid - 1; // mid đã quá lớn -> cần check ở range nhỏ hơn
            }
        }
        return right;
    }
}
