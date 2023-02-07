package day02;

public class LC1662_CheckIfTwoStringArraysareEquivalent {
    // Cách 1:
//    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        String s = "";
//        for (int i = 0; i < word1.length; i++) {
//            s += word1[i];
//        }
//        String s1 = "";
//        for (int i = 0; i < word2.length; i++) {
//            s1 += word2[i];
//        }
//        if (s.toLowerCase().equals(s1)) {
//            return true;
//        }
//        return false;
//    }

    // Cách 2: Sử dụng StringBuilder
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            s1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            s2.append(word2[i]);
        }
        return s1.toString().equals(s2.toString());
    }

    // Cách 3: Sử dụng String.join()
//    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        String s1 = String.join("", word1);
//        String s2 = String.join("", word2);
//        return s1.toString().equals(s2.toString());
//    }
}
