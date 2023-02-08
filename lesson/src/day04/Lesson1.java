package day04;

public class Lesson1 {
    // Bài 1: Tìm kiếm tuần tự sử dụng đệ quy.
    // find: Hàm find có chức năng tìm biến x trong mảng a và trả về index của x trong mảng a.
    // x: số cần tìm
    // a: mảng đang tìm kiếm
    // i: -tùy chọn- (bạn tự định nghĩa, có thể dùng hoặc ko dùng)
    // return: - Nếu x tồn tại trong a thì return về index.
    //         - Nếu không tồn tại return -1.

    public static int find(int x, int[] a, int i) {
        if (i >= a.length) {
            return -1;
        }
        if (a[i] == x) {
            return i;
        }
        return find(x, a, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(find(5, a, 0));
    }
}
