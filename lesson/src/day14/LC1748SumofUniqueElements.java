package day14;

public class LC1748SumofUniqueElements {
    public int sumOfUnique(int[] nums) {
        int sum = 0;                        // Tạo biến sum để trả về tổng
        for (int i = 0; i < nums.length; i++) {     // Duyệt mảng nums, mỗi lần duyệt ta tạo 1 biến count để đếm xem mỗi vị trí index tồn tại trong mảng bn lần
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {           // trong mảng chắc chắn tồn tại 1 lần duy nhất nên count nhỏ nhất sẽ là 1
                    count++;
                }
            }
            if (count == 1) {           // Nếu tồn tại 2 lần thì sẽ ko vào đc điều kiện if này để tính tổng
                sum += nums[i];
            }
        }
        return sum;
    }
    // Độ phức tạp qua 2 vòng lặp for thì sẽ là O(n^2). Bài này có tạo biến sum bên ngoài thì kết quả là: 1 + O(n^2)
    // n = độ dài mảng
}
