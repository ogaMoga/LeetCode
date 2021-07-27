package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(value -> value[0]));
        List<int[]> result = new ArrayList<>(intervals.length);
        int rangeStart;
        int rangeEnd;
        for (int i = 0; i < intervals.length; i++) {
            rangeStart = intervals[i][0];
            rangeEnd = intervals[i][1];
            while ((i < intervals.length - 1) && (rangeEnd >= intervals[i + 1][0])) {
                i++;
                if (intervals[i][1] > rangeEnd) {
                    rangeEnd = intervals[i][1];
                }
            }
            result.add(new int[] {rangeStart, rangeEnd});
        }
        return result.toArray(new int[result.size()][]);
    }
}
