package day07;

public class LC75_SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0; // Con trỏ left trỏ đến phần tử đầu tiên của mảng
        int right = n - 1; // Con trỏ right trỏ đến phần tử cuối cùng của mảng
        int i = 0; // Con trỏ i duyệt mảng

        while (i <= right) { // Duyệt mảng từ đầu đến cuối
            if (nums[i] == 0) { // Nếu phần tử hiện tại là 0
                swap(nums, i, left); // Đổi chỗ phần tử hiện tại với phần tử trỏ bởi left
                left++; // Tăng left lên 1
                i++; // Tăng i lên 1
            } else if (nums[i] == 2) { // Nếu phần tử hiện tại là 2
                swap(nums, i, right); // Đổi chỗ phần tử hiện tại với phần tử trỏ bởi right
                right--; // Giảm right xuống 1
            } else { // Nếu phần tử hiện tại là 1
                i++; // Tăng i lên 1
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
