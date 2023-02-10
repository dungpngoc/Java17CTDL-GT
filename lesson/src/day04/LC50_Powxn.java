package day04;

public class LC50_Powxn {
    // Cách 1
    public static double myPow(double x, int n) {
        // Điều kiện dừng
//        if (n == 0) {
//            return 1;
//        }
//
//        if (n == Integer.MIN_VALUE) {
//            x = x * x;
//            n = n / 2;
//        }
//        if (n < 0) {
//            n = -n;
//            x = 1 / x;
//        }
//        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
        // Cách 2 :
        return pow(x,n);
    }

    // Cách 2
    public static double pow(double x, long n) {
        if (x == 0 || n == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1/x;
            n = -n;
        }
        if (n % 2 == 0) {
            return pow(x * x, n / 2);
        }
        return x * pow(x * x, n / 2);
    }

    public static void main(String[] args) {
//        System.out.println(myPow(5,3));
    }
}
