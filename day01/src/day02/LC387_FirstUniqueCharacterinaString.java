package day02;

public class LC387_FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s) {
        int[] alphabet = new int[26];
        // bắt đầu từ 'a' -> index = 0 -> 'a' - 'a'
        // index b: 'b' - 'a' = 1
        // index of c: 'c' - 'a' = 2
        // kết thúc tại 'z' -> index = 25
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alphabet[c - 'a']++; // character - 'a' -> index tương ứng với character
        } // đếm được số lần xuất hiện của tất cả các ký tự trong s
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            System.out.println("character = " + character);
            if (alphabet[character - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        firstUniqChar("leetcode");
    }
}
