package day04;

public class LC344_ReverseString_Recursion {
    public static void reverseString(char[] s) {
        // Gọi hàm methodRecursion ( Truyền từ vị trí index 0, đến vị trí cuối cùng của mảng. Và truyền vào mảng s)
        methodRecursion(0, s.length - 1, s);
    }

    private static void methodRecursion(int left, int right, char[] s) {
        // Bài toán cơ sở
        if (left >= right) {
            return;
        }
        // Công thức đệ quy
        char temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;
        methodRecursion(left, right, s);
        // 1,2,3,4,5,6,7,8
        // temp = s[left] ( temp = 1)
        // 1, s1 = 8,
        // s7 = 1
    }

    public static void main(String[] args) {
        char[] s1 = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
    }
}
