package easy;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1) {
            return false;
        }
        byte[] src = s.getBytes();
        for (int len = 1; len <= src.length / 2; len++) {
            if (src.length % len != 0) {
                continue;
            }
            boolean badPrefix = false;
            for (int i = 0; i < src.length / len - 1; i++) {
                int j = 0;
                while (((j < len) && (src[i * len + j] == src[i * len + len + j]))) {
                    j++;
                }
                if (j < len) {
                    badPrefix = true;
                    break;
                }
            }
            if (!badPrefix) {
                return true;
            }
        }
        return false;
    }
}
