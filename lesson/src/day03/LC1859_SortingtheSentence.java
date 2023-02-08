package day03;

import java.util.Arrays;
import java.util.Comparator;

public class LC1859_SortingtheSentence {
    // Cách 1: Sử dụng tách chuỗi thành mảng -> Lấy vị trí cuối cùng -> Chuyển về chuỗi
//    public String sortSentence(String s) {
//        String[] str = s.split(" ");
//        String[] newStr = new String[str.length];
//        for (String s1: str) {
//            int k = s1.charAt(s1.length() - 1 - '0');
//            newStr[k - 1] = s1.substring(0,s1.length() - 1);
//        }
//        return String.join(" ",newStr);
//    }

    // Cách 2: Sử dụng Arrays.sort
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(o1.length() - 1) - o2.charAt(o2.length() - 1);
            }
        });
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, words[i].length() - 1);
        }
        return String.join(" ", words);
    }

}
