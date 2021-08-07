package easy;

public class RearrangeSpacesBetweenWords {
    public String reorderSpaces(String text) {
        int spaceCount = 0;
        int wordCount = 0;

        byte[] src = text.getBytes();
        for (int i = 0; i < src.length; i++) {
            if (src[i] == ' ') {
                spaceCount++;
            }
            if (src[i] != ' ' && (i == 0 || src[i - 1] == ' ')) {
                wordCount++;
            }
        }
        int resultSpaceCount;
        if (wordCount == 1) {
            resultSpaceCount = spaceCount;
        } else {
            resultSpaceCount = spaceCount / (wordCount - 1);
        }
        byte[] res = new byte[src.length];
        int i = 0;
        int k = 0;
        while (src[i] == ' ') {
            i++;
        }
        while (k < res.length && i < src.length) {
            if (src[i] != ' ') {
                res[k] = src[i];
                i++;
                k++;
            } else {
                while (i < src.length && src[i] == ' ') {
                    i++;
                }
                if (i == src.length) {
                    break;
                }
                for (int j = 0; j < resultSpaceCount; j++) {
                    res[k] = ' ';
                    k++;
                }
            }
        }
        while (k < i) {
            res[k] = ' ';
            k++;
        }
        return new String(res);
    }
}
