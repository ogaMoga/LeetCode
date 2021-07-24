package easy;

public class DIStringMatch {
    public int[] diStringMatch(String s) {
        byte[] src = s.getBytes();
        int[] result = new int[src.length + 1];
        int i = 0;
        int d = s.length();
        for (int j = 0; j < src.length; j++) {
            if (src[j] == 'I') {
                result[j] = i;
                i++;
            } else {
                result[j] = d;
                d--;
            }
        }
        if (src[src.length - 1] == 'I') {
            result[result.length - 1] = d;
        } else {
            result[result.length - 1] = i;
        }
        return result;
    }
}
