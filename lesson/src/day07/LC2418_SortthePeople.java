package day07;

public class LC2418_SortthePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        // Duyệt mảng qua 2 vòng lặp, sử dụng thuật toán nổi bọt, so sánh 2 cặp liên tiếp và hoán đổi vị trí cho nhau.
        // So sánh đến lúc sắp xếp xog.
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (heights[j] < heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    String swap = names[j]; // Sau khi hoán đổi vị trí ở mảng height thì phải đổi vị trí ứng với giá trị của mảng String
                    names[j] = names[j + 1];
                    names[j + 1] = swap;
                }
            }
        }
        return names;
    }
}
