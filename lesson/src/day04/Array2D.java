package day04;

// Duyệt một mảng 2 chiều bằng đệ quy
// Cho một mảng 2 chiều có dạng:
// [1,2,3]
// [4,5,6]
// Sử dụng đệ quy để duyệt và in ra mảng đúng như thứ tự trên
public class Array2D {
    public static void printArray(int[][] array, int i, int j) {
        // Bài toán cơ sở
        if (i == array.length) {
            return;
        }
        // Công thức đệ quy
        if (j == array[i].length) {
            System.out.println();
            printArray(array, i + 1, 0);
            return;
        }
        System.out.print(array[i][j] + " ");
        printArray(array, i, j + 1);
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        printArray(array, 0, 0);
    }
}
