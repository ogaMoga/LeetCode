package easy;

import java.util.ArrayDeque;
import java.util.Queue;

public class RecentCounter {
    private final Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        while (queue.size() > 0 && t - queue.peek() > 3000) {
            queue.poll();
        }
        queue.add(t);
        return queue.size();
    }
}
