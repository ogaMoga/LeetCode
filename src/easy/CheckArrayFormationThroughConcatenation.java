package easy;

import java.util.HashMap;
import java.util.Map;

public class CheckArrayFormationThroughConcatenation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>(pieces.length);
        for (int[] piece : pieces) {
            map.put(piece[0], piece);
        }
        int i = 0;
        while (i < arr.length) {
            if (!map.containsKey(arr[i])) {
                return false;
            }
            int[] current = map.get(arr[i]);
            map.remove(arr[i]);
            for (int j = 0; j < current.length; i++, j++) {
                if (arr[i] != current[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
