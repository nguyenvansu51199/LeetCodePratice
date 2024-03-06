package LinkedList;

public class _19RemoveNthNodeFromofList {

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
    public static ListNode removeNthFromEnd(ListNode head, int n) {
      if (head == null)
        return null;

      ListNode curNode = head;
      ListNode prevNode = null;
      int count = countLinkedList(head);
      int k = 1;
      int index = count - n + 1;
      if (index == 1) {
        return curNode.next;
      }
      while (curNode != null) {
        if (k == index) {
          break;
        }
        k++;
        prevNode = curNode;
        curNode = curNode.next;
      }

      prevNode.next = curNode.next;
      return head;
    }

    public static int countLinkedList(ListNode head) {
      int count = 0;

      while (head != null) {
        count++;
        head = head.next;
      }

      return count;
    }

    public static void printLinkedList(ListNode head) {
      while (head != null) {
        System.out.print(head.val + " ");
        head = head.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);

    ListNode n5 = new ListNode(5);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    Solution.printLinkedList(n1);

    // System.out.println(Solution.countLinkedList(n1));

    ListNode newList = Solution.removeNthFromEnd(n1, 2);
    Solution.printLinkedList(newList);

  }
}
