package day04;

public class Fibonacci {
    // Tìm số Fibonacci thứ n
    public static int Fibo(int n) {
        // 1. Bài toán cơ sở
        if (n <= 2) {
            return 1;
        }
        // 2. Công thức quy nạp
        int Fn = Fibo(n - 1) + Fibo(n - 2);
        return Fn;
    }

    public static void main(String[] args) {
        System.out.println(Fibo(8));
        System.out.println(Fibo(9));
    }
}
