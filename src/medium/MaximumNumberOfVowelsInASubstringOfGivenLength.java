package medium;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int current = 0;
        byte[] source = s.getBytes();
        for (int i = 0; i < k; i++) {
            if (isVowelLetter(source[i])) {
                current++;
            }
        }
        int result = current;
        for (int i = 1; i < source.length - k + 1; i++) {
            if (isVowelLetter(source[i - 1])) {
                current--;
            }
            if (isVowelLetter(source[i + k - 1])) {
                current++;
            }
            if (current > result) {
                result = current;
            }
        }
        return result;
    }

    boolean isVowelLetter(byte l) {
        return l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u';
    }
}
