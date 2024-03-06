package LinkedList;

public class _206ReverseLinkedList {

  public static class ListNode {
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

  static class Solution {
    public static ListNode reverseList1(ListNode head) {
      ListNode curNode = head;

      while (curNode != null && curNode.next != null) {
        ListNode nextNode = curNode.next;
        curNode.next = nextNode.next;
        nextNode.next = head;
        head = nextNode;
      }

      return head;
    }
  }

  public static ListNode reverseList(ListNode head) {
    if (head == null)
      return null;

    ListNode nextNode = head.next;
    if (nextNode.next == null)
      return null;

    ListNode newHead = reverseList(nextNode);
    nextNode.next = head;
    head.next = null;

    return newHead;
  }

  public static void printLinkedList(ListNode head) {
    while (head != null) {
      System.out.printf("%d ", head.val);
      head = head.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);

    ListNode n3 = new ListNode(3);
    n1.next = n2;
    n2.next = n3;

    printLinkedList(n1);

    ListNode newList = Solution.reverseList(n1);
    printLinkedList(newList);
  }
}
