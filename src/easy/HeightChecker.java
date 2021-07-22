package easy;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int res = 0;
        int[] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length);
        countingSort(expected);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i])
                res++;
            }
        return res;
    }

    private void countingSort(int[] expected) {
        int[] counts = new int[101];
        for (int k : expected) {
            counts[k]++;
        }
        int current = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] != 0) {
                for (int j = 0; j < counts[i]; j++) {
                    expected[current] = i;
                    current++;
                }
            }
        }
    }
}
