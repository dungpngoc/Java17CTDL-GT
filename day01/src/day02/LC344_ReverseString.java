package day02;

import java.util.Arrays;

public class LC344_ReverseString {
    public void reverseString(char[] s) {
        String s1 = new String(s);
        StringBuilder str = new StringBuilder(s1);
        str.reverse().toString();
    }
}
