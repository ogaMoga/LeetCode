package easy;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        byte[] src = s.getBytes();
        int[] lower = new int[26];
        int[] upper = new int[26];
        for (byte letter : src) {
            if (Character.isUpperCase(letter)) {
                upper[letter - 'A']++;
            } else {
                lower[letter - 'a']++;
            }
        }
        int pairsCount = 0;
        boolean centerLetter = false;
        for (int i : lower) {
            pairsCount += i / 2;
            if (i % 2 != 0) {
                centerLetter = true;
            }
        }
        for (int i : upper) {
            pairsCount += i / 2;
            if (i % 2 != 0) {
                centerLetter = true;
            }
        }
        if (centerLetter) {
            return pairsCount * 2 + 1;
        } else {
            return pairsCount * 2;
        }
    }
}
