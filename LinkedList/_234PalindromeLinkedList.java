package LinkedList;

public class _234PalindromeLinkedList {

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

    public static int countLinkedList(ListNode head) {
      int count = 0;

      if (head != null) {
        while (head != null) {
          count++;
          head = head.next;
        }
      }
      return count;
    }

    public static ListNode reservNode(ListNode head) {
      ListNode lastNode = head;

      while (lastNode != null && lastNode.next != null) {
        ListNode nextNode = lastNode.next;
        lastNode.next = nextNode.next;
        nextNode.next = head;
        head = nextNode;
      }

      return head;
    }

    public static boolean isPalindrome(ListNode head) {
      int count = countLinkedList(head);
      if (count == 0) {
      

      // 1 2 3 k = 1 n =2
      // 1 2 | 3 4 k = 2 n = 2
      // 1 2 3 4 5 k = 2
      int k = count / 2;
      if (k == 0) {
        return false;
      }
      int index = 0;
      ListNode curNode = head;
      while (curNode != null) {
        int n = count % 2 == 0 ? k : k + 1;

        if (index == n) {
          break;
        }
        index++;
        curNode = curNode.next;
      }

      ListNode the2ndNode = reservNode(curNode);

      while (the2ndNode != null) {
        if (head.val != the2ndNode.val) {
          return false;
        }

        head = head.next;
        the2ndNode = the2ndNode.next;
      }

      return true;
    }
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
    // ListNode n2 = new ListNode(1);
    // ListNode n3 = new ListNode(1);
    // n1.next = n2;
    // n2.next = n3;

    // printLinkedList(n1);
    // System.out.println(Solution.countLinkedList(n1));
    // ListNode newList = Solution.reservNode(n1);
    // printLinkedList(newList);

    System.out.println(Solution.isPalindrome(n1));
  }
}
