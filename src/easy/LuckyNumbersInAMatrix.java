package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] mins = new int[matrix.length];
        int[] maxs = new int[matrix[0].length];
        Arrays.fill(mins, Integer.MAX_VALUE);
        Arrays.fill(maxs, Integer.MIN_VALUE);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((mins[i] == Integer.MAX_VALUE) || (matrix[i][j] < matrix[i][mins[i]])) {
                    mins[i] = j;
                }
                if ((maxs[j] == Integer.MIN_VALUE) || (matrix[i][j] > matrix[maxs[j]][j])) {
                    maxs[j] = i;
                }
            }
        }

        List<Integer> result = new ArrayList<>(Math.max(matrix.length, matrix[0].length));
        if (mins.length >= maxs.length) {
            for (int i = 0; i < mins.length; i++) {
                if (i == maxs[mins[i]]) {
                    result.add(matrix[i][mins[i]]);
                }
            }
        } else {
            for (int i = 0; i < maxs.length; i++) {
                if (i == mins[maxs[i]]) {
                    result.add(matrix[maxs[i]][i]);
                }
            }
        }

        return result;
    }
}
