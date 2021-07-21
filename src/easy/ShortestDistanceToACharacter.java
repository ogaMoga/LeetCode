package easy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        Queue<Integer> queue = new ArrayDeque<>(s.length());
        int[] result = new int[s.length()];
        Arrays.fill(result, Integer.MAX_VALUE);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                queue.add(i);
                result[i] = 0;
            }
        }

        while (queue.size() > 0) {
            Integer currentIndex = queue.poll();
            int newPosition = Math.max(currentIndex - 1, 0);
            int newValue = result[currentIndex] + 1;
            updateNewPosition(queue, result, newPosition, newValue);
            newPosition = Math.min(currentIndex + 1, s.length() - 1);
            updateNewPosition(queue, result, newPosition, newValue);
        }
        return result;
    }

    private void updateNewPosition(Queue<Integer> queue, int[] result, int newPosition, int newValue) {
        if (newValue < result[newPosition]) {
            result[newPosition] = newValue;
            queue.add(newPosition);
        }
    }
}
