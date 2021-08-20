package medium;

public class RemoveNthNodeFromEndOfList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int count = 1;
        while(current.next != null) {
            count++;
            current = current.next;
        }
        if (count == n) {
            return head.next;
        }
        current = head;
        for (int i = 0; i < count - n - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }
}
