package day04;

public class LessonFibonacci {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = new int[1000];
        System.out.println(fibo2(10,arr));
        System.out.println("fibo2 count = " + count);
        for (int i = 3; i <= 10 ; i++) {
            arr[i] = arr[i + 1];
        }
//        System.out.println(fibonacci(6));
        int[] a = {1,24,35,42,5,63,7,8};
        System.out.println(sum(7,a));
    }

    private static int sum(int n, int[] arr) {
        // Điều kiện dừng
        if (n < 0) {
            // sum -> 0
            return 0;
        }
        return arr[n] + sum(n - 1,arr);
    }
    // arr[0] =f(0)
    // arr[1] = f(1)
    //.. arr[n] = f(n)
    private static int fibo2(int n, int[] arr) {
        System.out.println("start = " + n);
        if (n <= 2) {
            System.out.println("end n = " + n);
            return 1;
        }
        if (arr[n] == 0) {
            arr[n] = fibo2(n - 1, arr) + fibo2(n - 2, arr);
        }
        System.out.println("end n = " + n);
        return arr[n];
    }

    private static int fibonacci(int n) {
        System.out.println("start n = " + n);
        if (n <= 2) {
            System.out.println("end n = " + n);
            return 1;
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        System.out.println("end n = " + n);
        return result;
    }
}
