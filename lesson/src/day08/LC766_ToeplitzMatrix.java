package day08;

public class LC766_ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < col; i++) {
            int num = matrix[0][i];
            for (int j = 1; i + j < col && j < row; j++) {
                if (matrix[j][i + j] != num) {
                    return false;
                }
            }
        }
        for (int i = 1; i < row; i++) {
            int num = matrix[i][0];
            for (int j = 1; i + j < row && j < col; j++) {
                if (matrix[i + j][j] != num) {
                    return false;
                }
            }
        }
        return true;
    }
}
