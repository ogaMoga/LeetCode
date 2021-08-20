package medium;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode lessHead = new ListNode();
        ListNode lessCurrent = lessHead;
        ListNode current = head;
        while (current.next != null) {
            if (current.next.val < x) {
                lessCurrent.next = current.next;
                lessCurrent = lessCurrent.next;
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        if (lessHead.next == null) {
            return head;
        }
        lessHead = lessHead.next;
        if (head.val < x) {
            ListNode lessNext = lessHead;
            lessHead = head;
            head = head.next;
            lessHead.next = lessNext;
        }
        lessCurrent.next = head;
        return lessHead;
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
