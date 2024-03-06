package StackQueue;

public class _933NumberofRecentCalls {
  /**
   * Node
   */

  class RecentCounter {
    public class Node {
      int val;
      Node next;

      Node(int val) {
        this.val = val;
      }
    }

    int TIME = 3000;
    int count = 0;
    Node head;
    Node tail;

    public RecentCounter() {
    }

    public boolean isEmpty() {
      if ((head == null) && (tail == null)) {
        return true;
      }
      return false;
    }

    public int ping(int t) {
      Node newNode = new Node(t);
      if (isEmpty()) {
        head = tail = newNode;
        count++;
        return count;
      } else {
        tail.next = newNode;
        tail = newNode;
      }

      if (tail.val - head.val <= TIME) {
        count++;
      } else {

        Node temp = head;
        while (temp != null) {
          if (tail.val - temp.val > TIME) {
            count = 0;
            temp = temp.next;
          } else {
            break;
          }
        }
        head = temp;
        while (temp != null) {
          count++;
          temp = temp.next;
        }
      }

      return count;
    }
  }

}
