package easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStacks {
    private final Deque<Integer> data;
    private final Deque<Integer> reverse;
    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks() {
        data = new ArrayDeque<>();
        reverse = new ArrayDeque<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        data.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!data.isEmpty()) {
            reverse.push(data.pop());
        }
        int result = reverse.pop();
        while (!reverse.isEmpty()) {
            data.push(reverse.pop());
        }
        return result;
    }

    /** Get the front element. */
    public int peek() {
        while (!data.isEmpty()) {
            reverse.push(data.pop());
        }
        int result = reverse.peek();
        while (!reverse.isEmpty()) {
            data.push(reverse.pop());
        }
        return result;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return data.isEmpty();
    }
}
