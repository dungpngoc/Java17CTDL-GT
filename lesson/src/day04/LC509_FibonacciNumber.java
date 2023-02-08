package day04;

public class LC509_FibonacciNumber {
    public static int fib(int n) {
        // Bài toán cơ sở
        if (n <= 2) {
            return 1;
        }
        // Công thức đệ quy
        int Fn = fib(n - 1) + fib(n- 2);
        return Fn;
    }
    // Fn = fib4 + fib3 = fib3 + fib2 + fib2 + fib1 = fib2 + fib1 + 3 = 5

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
