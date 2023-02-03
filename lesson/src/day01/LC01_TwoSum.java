package day01;

public class LC01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target && i != j) {
                    for (int k = 0; k < result.length ; k++) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }
}
