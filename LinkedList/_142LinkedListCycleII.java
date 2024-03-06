package LinkedList;

public class _142LinkedListCycleII {

  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public class Solution {

    public static int checkNode(ListNode head) {
      ListNode curNode = head;
      ListNode prevNode = head;
      if (head == null)
        return -1;
      while (curNode != null && prevNode != null && curNode.next != null) {

        curNode = curNode.next.next;
        prevNode = prevNode.next;
        if (curNode == prevNode) {
          if (curNode == head) {
            return 1;
          }
          return 0;
        }

      }

      return -1;
    }

    public ListNode detectCycle(ListNode head) {
      ListNode temp = head;

      while (temp != null) {
        int count = checkNode(temp);
        if (count == -1) {
          return null;
        } else if (count == 1) {
          return temp;
        } else {
          temp = temp.next;
        }
      }
      return null;
    }
  }
}
