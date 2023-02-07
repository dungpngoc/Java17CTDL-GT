package day02;

public class LC1816_TruncateSentence {
    // Cách 1
//    public String truncateSentence(String s, int k) {
//        String[] str = new String[k];
//        String[] arr = s.split(" ");
//        for (int i = 0; i < k; i++) {
//            str[i] = arr[i];
//        }
//        String s1 = String.join(" ",str);
//        return s1;
//    }

    // Cách 2
//    public String truncateSentence(String s, int k) {
//        int index = 0;
//        int count = 0;
//        while (index < s.length() && count < k) {
//            if (s.charAt(index) == ' ') {
//                count++;
//            }
//            index++;
//        }
//        return s.substring(0,index).trim();
//    }

    // Cách 3: Sử dụng StringBuiler
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < k - 1; i++) {
            stringBuilder.append(words[i]).append(" ");
        }
        stringBuilder.append(words[k - 1]);
        return stringBuilder.toString();
    }
}
