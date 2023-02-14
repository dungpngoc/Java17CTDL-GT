package day07;

public class LC1512_NumberofGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;      // Tạo biến đếm count để đếm các cặp thoả mãn điều kiện là num[i] == num[j] && i < j
        for (int i = 0; i < nums.length; i++) {     // Cho vào 2 vòng lặp để tìm các cặp đẹp thoả mãn đk đề bài
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {      // Điều kiện đề bài: Mỗi cặp thoả mãn thì count++
                    count++;
                }
            }
        }
        return count;   // Cuối cùng trả về biến count đếm đc tất cả có bao nhiêu cặp thoả mãn
    }
}
