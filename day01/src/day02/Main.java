package day02;

public class Main {
    public static void main(String[] args) {
        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6}
        };
        // array2D.length -> số row, số col của ma trận
        for (int i = 0; i < array2D.length; i++) {
            System.out.println("Độ dài của dòng thứ i = " + i + " là: " + array2D[i].length);
            for (int j = 0; j < array2D[i].length; j++) { // in ra tất cả phần tử ở dòng thứ i
                System.out.print(array2D[i][j] + " "); // array[row][col]
            }
            System.out.println("");
        }

        int[][] arr2 = new int[2][4];
        for (int i = 0; i < arr2.length; i++) { // duyệt số dòng của mảng
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = 1;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
