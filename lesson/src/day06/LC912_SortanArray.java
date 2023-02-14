package day06;

import java.util.Arrays;

public class LC912_SortanArray {
        public static void main(String[] args) {
        // pivot = 9
        // chia làm 2 phần
        // left < 9
        // right > 9
        int[] a = {9, 7, 5, 8, 4, 1, 2};

        System.out.println(Arrays.toString(sortArray(a)));
    }
    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int sortedItem = partition(arr, low, high); // Tìm được 1 phần tử sorted
            quickSort(arr, low, sortedItem - 1);
            quickSort(arr, sortedItem + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int left = low;
        int right = high - 1;
        while (true) {
            // Tìm phần tử phía bên trái mà lớn hơn pivot
            while (left <= right && arr[left] < pivot) {
                left++; // Tìm được arr[left] > pivot
            }
            while (arr[right] > pivot && left <= right) {
                right--;
            }
            if (left >= right) {
                break;
            }
            swap(arr, left, right);
            left++;
            right--;
        }
        System.out.println("pivot = " + pivot + " index = " + low + " - right = " + right);
        swap(arr, low, right);
        return right;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

