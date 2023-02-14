package day07;

public class LC832_FlippinganImage {
    public int[][] flipAndInvertImage(int[][] image) {
        // Tạo 2 biến hàng và cột ứng với chiều dài.
        int rows = image.length;
        int cols = image[0].length;

        // Đảo ngược mảng
        // Đầu tiên là duyệt qua các hàng( sử dụng vòng lăp for đê duyệt)
        for (int i = 0; i < rows; i++) {
            int left = 0, right = cols - 1; // Tạo 2 con trỏ trái phải ứng với chỉ số index trong mảng cần duyệt
            while (left < right) {  // điều kiện để kết thúc
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
        }

        // Đảo ngược giá trị
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                } else if (image[i][j] == 0) {
                    image[i][j] = 1;
                }
            }
        }

        return image;
    }
}
