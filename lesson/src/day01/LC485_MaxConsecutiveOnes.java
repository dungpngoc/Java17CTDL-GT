package day01;

public class LC485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i + 1]) {
                count = 1;
            }
            if (nums[i] == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
