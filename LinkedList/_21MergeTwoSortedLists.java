package LinkedList;

public class _21MergeTwoSortedLists {
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
    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // if (list1 == null)
    // return list2;

    // if (list2 == null)
    // return list1;

    // if (list1.val <= list2.val) {
    // ListNode nextlist1 = list1.next;
    // ListNode nextElement = mergeTwoLists(nextlist1, list2);
    // list1.next = nextElement;
    // return list1;
    // } else {
    // mergeTwoLists(list2, list1);
    // return list2;
    // }
    // }

    public ListNode mergeTwoLists(ListNode L, ListNode R) {
      if (L == null)
        return R;
      if (R == null)
        return L;

      ListNode temp = null;
      ListNode head = null;

      while (L != null && R != null) {
        if (L.val < R.val) {
          if (head == null) {
            head = L;
            temp = L;
          } else {
            temp.next = L;
            temp = L;
          }

          L = L.next;

        } else {
          if (head == null) {
            head = R;
            temp = R;
          } else {
            temp.next = R;
            temp = R;
          }

          R = R.next;

        }
        if (L != null) {
          temp.next = L;
        }
        if (R != null) {
          temp.next = R;
        }
      }

      return head;
    }

  }
}
