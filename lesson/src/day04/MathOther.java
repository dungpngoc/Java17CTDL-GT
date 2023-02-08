package day04;

public class MathOther {
    // Tính tổng từ 1 đến n: T(n) = n + T(n-1)
    // Tính số mũ A^n = A^n-1 * A
    // Tìm Ước số chung lớn nhất - UCLN
    // Tìm Bội số chung nhỏ nhất - BCNN
    // Bài toán tháp Hà Nội

    // In giá trị của một mảng số nguyên
    // In ra các phần tử theo thứ tự từ n - 1 đến 0 ( Thực hiện đệ quy trước)
    public static void printElement(int[] arr, int index) {
        // Bài toán cơ sở
        if (index < 0 || index >= arr.length) {
            return;
        }
        // Công thức quy nạp: in phần tử index, print index + 1
        printElement(arr,index + 1);
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        printElement(arr,0);
    }

}
