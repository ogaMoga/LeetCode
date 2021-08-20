package easy;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] src = s.toCharArray();
        for (int i = 0, j = src.length - 1; i < j;) {
            while (i < src.length && !Character.isLetter(src[i])) {
                i++;
            }
            while (j > 0 && !Character.isLetter(src[j])) {
                j--;
            }
            if (i >= j || i >= src.length) {
                break;
            }
            char swap = src[i];
            src[i] = src[j];
            src[j] = swap;
            i++;
            j--;
        }
        return new String(src);
    }
}
