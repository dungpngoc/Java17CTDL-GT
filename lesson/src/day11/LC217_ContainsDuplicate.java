package day11;

import java.util.HashSet;
import java.util.Set;

public class LC217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();

        for (int n: nums) {
            if (mySet.contains(n)) { // Đã tồn tại trong mySet
                return true;
            } else {    // Chưa tồn tại
                mySet.add(n);
            }
        }
        return false;
    }
}
