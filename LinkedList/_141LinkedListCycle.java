package LinkedList;

public class _141LinkedListCycle {
  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public class Solution {
    public boolean hasCycle(ListNode head) {
      if (head == null || head.next == null)
        return false;

      ListNode slow = head;
      ListNode fast = head.next;
      final int STEP_MAX = 2;
      while (slow != null) {
        int count = 0;
        while (fast != null) {
          if (fast == slow) {
            return true;
          }

          fast = fast.next;
          count++;
          if (count == STEP_MAX) {
            break;
          }
        }
        slow = slow.next;
      }
      return false;
    }

  }

}
