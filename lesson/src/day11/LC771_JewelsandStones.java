package day11;

import java.util.HashSet;
import java.util.Set;

public class LC771_JewelsandStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> mySet = new HashSet<>();
        for (char c : jewels.toCharArray()) {   // chuyển String jewels sang mảng các kí tự và duyệt sau đó cho vào mySet
            mySet.add(c);
        }
        for (char c : stones.toCharArray()) {   // chuyển String stones sang mảng các kí tự và tìm trong mySet, nếu có thì count++
            if (mySet.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
