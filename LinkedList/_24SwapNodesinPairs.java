package LinkedList;

public class _24SwapNodesinPairs {
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

  public ListNode swapPairs(ListNode head) {
    // THCS:
    if (head == null)
      return null;
    if (head.next == null)
      return head;

    // THTQ
    ListNode nextNode = head.next;

    head.next = nextNode.next;
    nextNode.next = head;

    ListNode newNode = swapPairs(head.next);

    head.next = newNode;

    return nextNode;
  }
}
