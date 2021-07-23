package easy;

public class SortingTheSentence {
    public String sortSentence(String s) {
        StringBuilder[] result = new StringBuilder[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = new StringBuilder();
        }
        char[] src = s.toCharArray();
        StringBuilder current = new StringBuilder();
        for (char c : src) {
            if (Character.isDigit(c)) {
                result[c - '0'].append(current);
                current.setLength(0);
            } else if (c != ' '){
                current.append(c);
            }
        }
        StringBuilder resultBuilder = new StringBuilder(src.length);
        for (StringBuilder stringBuilder : result) {
            if (stringBuilder.length() != 0) {
                resultBuilder.append(stringBuilder).append(' ');
            }
        }
        resultBuilder.delete(resultBuilder.length() - 1, resultBuilder.length());
        return resultBuilder.toString();
    }
}
