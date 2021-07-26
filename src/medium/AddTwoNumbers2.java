package medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        ListNode current = l1;
        while (current != null) {
            stack1.push(current.val);
            current = current.next;
        }
        current = l2;
        while (current != null) {
            stack2.push(current.val);
            current = current.next;
        }
        ListNode result = new ListNode();
        ListNode currentNode = result;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                getFromStack(stack2, currentNode);
                break;
            }
            if (stack2.isEmpty()) {
                getFromStack(stack1, currentNode);
                break;
            }
            int value = currentNode.val + stack1.pop() + stack2.pop();
            currentNode.val = value % 10;
            if (value > 9 || !stack1.isEmpty() || !stack2.isEmpty()) {
                currentNode.next = new ListNode();
                currentNode.next.val = value / 10;
            }
            currentNode = currentNode.next;
        }
        return reverse(result);
    }

    private void getFromStack(Deque<Integer> stack2, ListNode currentNode) {
        while (!stack2.isEmpty()) {
            int value = currentNode.val + stack2.pop();
            currentNode.val = value % 10;
            if (value > 9 || !stack2.isEmpty()) {
                currentNode.next = new ListNode();
                currentNode.next.val += value / 10;
            }
            currentNode = currentNode.next;
        }
    }

    private ListNode reverse(ListNode src) {
        ListNode previous = null;
        ListNode next;
        while (src != null){
            next = src.next;
            src.next = previous;
            previous = src;
            src = next;
        }
        return previous;
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
