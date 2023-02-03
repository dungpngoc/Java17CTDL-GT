package day02;

public class LC1662_CheckIfTwoStringArraysareEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s = "";
        for (int i = 0; i < word1.length; i++) {
            s += word1[i];
        }
        String s1 = "";
        for (int i = 0; i < word2.length; i++) {
            s1 += word2[i];
        }
        if (s.toLowerCase().equals(s1)) {
            return true;
        }
        return false;
    }
}
