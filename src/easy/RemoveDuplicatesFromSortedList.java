package easy;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while ((current != null) && (current.next != null)) {
            ListNode next = current;
            int currentValue = current.val;
            while (next != null && next.val == currentValue) {
                next = next.next;
            }
            current.next = next;
            current = next;
        }
        return head;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
