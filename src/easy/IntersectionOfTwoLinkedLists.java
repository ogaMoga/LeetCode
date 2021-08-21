package easy;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0;
        int countB = 0;
        ListNode current = headA;
        while (current != null) {
            countA++;
            current = current.next;
        }
        current = headB;
        while (current != null) {
            countB++;
            current = current.next;
        }

        if (countA > countB) {
            for (int i = 0; i < countA - countB; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < countB - countA; i++) {
                headB = headB.next;
            }
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
