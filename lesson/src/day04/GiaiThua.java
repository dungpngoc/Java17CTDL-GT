package day04;

public class GiaiThua {
    public static int GiaiThua(int n) {
        // Bài toán cơ sở
        if (n == 0) {
            return 1;
        }
        // Công thưc quy nạp
        int t = n * GiaiThua(n - 1);
        return t;
    }

    public static void main(String[] args) {
        System.out.println(GiaiThua(4));
    }
}
