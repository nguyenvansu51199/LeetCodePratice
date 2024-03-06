package LinkedList;

public class _160IntersectionofTwoLinkedLists {
  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public static class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode pA = headA;
    ListNode pB = headB;
    
    while (pA != pB) {
      if (pA != null) {
        pA = pA.next;
      } else {
        pA = headB;
      }

      if (pB != null) {
        pB = pB.next;
      } else {
        pB = headA;
      }
    }

    return pA;
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(7);
    ListNode n4 = new ListNode(4);
    ListNode n5 = new ListNode(5);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    ListNode l1 = new ListNode(3);

    ListNode l2 = new ListNode(4);

    ListNode l3 = new ListNode(5);

    l1.next = l2;
    l2.next = l3;

    System.out.println(Solution.getIntersectionNode(n4, l1));
  }
}
