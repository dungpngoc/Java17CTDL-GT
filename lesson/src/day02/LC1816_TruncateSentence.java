package day02;

public class LC1816_TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] str = new String[k];
        String[] arr = s.split(" ");
        for (int i = 0; i < k; i++) {
            str[i] = arr[i];
        }
        String s1 = String.join(" ",str);
        return s1;
    }
}
