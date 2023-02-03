package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 6;

        // chèn số 3 vào index = 1

        // di chuyển tất cả phần tử index = 1 sang phải

        // set arr[1] = 3

        arr[3] = arr[2];
        arr[2] = arr[1];
        arr[1] = 3;
        // print
        for (int i : arr) {
            System.out.println(i);
        }

//        List<Integer> list = new ArrayList<>();
//        list.add(1,1000);

        for (int i = 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[3] = 0;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}