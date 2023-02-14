package day07;

public class LC367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        // Duyệt từ 0 -> số num. nếu số nguyên bình phương = số chính phương num thì return true, thoát vòng lặp sẽ là false(nếu ko thoả mãn điều kiện)
        for (int i = 0; i * i >= 0 && i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}
