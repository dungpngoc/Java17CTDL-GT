package day04;

public class DeQuy_Recursion {
    public static void main(String[] args) {
//        print(0);
//        doSomething();
        factorial(4);
    }
    private static int factorial(int n) {
        // Công thức quy nạp, công thức tổng quát
        System.out.println("start n = " + n);
        if (n == 0) {
            System.out.println("end n = " + n);
            return 1;
        }
        int result = n * factorial(n - 1);
        System.out.println("end n = " + n);
        return result;

        // 0! = 1
        // 1! = 1*0
        // 2! = 2*1!
        // 3! = 3*2!
    }

    private static void doSomething() {
        int mySum = sum(1, 2);
        System.out.println(mySum);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    public static void print(int n) {
//        // Điều kiện dừng của đệ quy
//        if (n > 5) {
//            return;
//        }
//        System.out.println("start: n = " + n);
//        print(n + 1);
//        System.out.println("end: n = " + n);
//        System.out.print(n + " ");

//        for (int i = 1; i <= n; i++) {
//            System.out.println(i + " ");
//        }
    }
}
