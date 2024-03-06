package LinkedList;

public class _203RemoveLinkedListElements {
  public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  class Solution {
    public ListNode removeElements(ListNode head, int val) {

      if (head == null)
        return null;

      ListNode curNode = head;
      ListNode prevNode = null;

      while (curNode != null) {
        boolean bIsFound = false;
        if (curNode.val == val) {
          bIsFound = true;

          if (prevNode == null) {
            head = curNode.next;
          } else {
            prevNode.next = curNode.next;
          }
        }

        prevNode = bIsFound == true ? prevNode : curNode;
        curNode = curNode.next;
      }

      return head;
    }
  }
}