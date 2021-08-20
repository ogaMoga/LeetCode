package medium;

public class MaximumValueAfterInsertion {
    public String maxValue(String n, int x) {
        StringBuilder stringBuilder = new StringBuilder(n);
        int i = 0;
        if (stringBuilder.charAt(0) == '-') {
            i = 1;
            while (i < stringBuilder.length() && stringBuilder.charAt(i) - '0' <= x) {
                i++;
            }
        } else {
            while (i < stringBuilder.length() && stringBuilder.charAt(i) - '0' >= x) {
                i++;
            }
        }
        stringBuilder.insert(i, x);
        return stringBuilder.toString();
    }
}
