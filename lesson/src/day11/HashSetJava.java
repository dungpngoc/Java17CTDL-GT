package day11;

import java.util.*;

public class HashSetJava {
    public static void main(String[] args) {
        Set<Integer> myIntSet = new HashSet<>();
//        Set<String> myIntSet = new TreeSet<>();  // Tree sẽ sắp xếp theo thứ tự từ nhỏ đến bé hoặc theo độ dài của chuỗi String
//        Set<Integer> myIntSet = new LinkedHashSet<>(); // Linked thì sẽ add lần lượt
        myIntSet.add(1);
        myIntSet.add(2);
        myIntSet.add(3);
        myIntSet.add(1);
        myIntSet.add(2);

        for (Integer integer: myIntSet) {
            System.out.println(integer);
        }

    }
}
