package medium;

import java.util.Set;
import java.util.TreeSet;

public class MyCalendar1 {
    private final Set<Node> set;

    public MyCalendar1() {
        set = new TreeSet<>();
    }

    public boolean book(int start, int end) {
        Node node = new Node(start, end);
        if (set.contains(node)) {
            return false;
        } else {
            set.add(node);
            return true;
        }
    }

    class Node implements Comparable<Node>{
        private final int start;
        private final int end;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Node o) {
            if (o.start >= this.end) {
                return 1;
            } else if (o.end <= this.start) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
