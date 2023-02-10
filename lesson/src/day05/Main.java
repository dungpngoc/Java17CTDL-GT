package day05;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,4,9,12,19,25,31,46,50,57,52};
//        System.out.println("indexOf 46: " + binarySearch(a,46));

    }

//    private static int binarySearch(int[] arr, int target) {
//        int left = 0, right = arr.length - 1;
//        while (left <= right) { // left == right -> mảng con chỉ chứa duy nhất 1 phần tử: a[left] = a[mid] = a[right]
//            int mid = (left + right) / 2;
//            if (arr[mid] == target) {
//                return mid;
//            }
//            if (arr[mid] < target) {
//                // range: mid + 1 -> right
//                left = mid + 1;
//            } else {
//                // range: left -> mid - 1
//                right = mid - 1;
//            }
//        }
//        // left > right
//        return -1;
//    }

    private static int Recursion(int[] arr, int target, int left, int right) {
        // Cách 1:
        // Điêu kiện dừng
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // Công thức đệ quy

        if (arr[mid] < target) {
            return Recursion(arr,target,mid + 1,right);
        }
        return Recursion(arr,target,left,mid - 1);
    }


    // Cách 2:
    private static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
