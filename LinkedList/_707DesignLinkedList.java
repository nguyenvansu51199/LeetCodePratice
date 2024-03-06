package LinkedList;

// import LinkedList._141LinkedListCycle.ListNode;

public class _707DesignLinkedList {
  static class MyLinkedList {
    int val;
    MyLinkedList next;

    static MyLinkedList head;

    public MyLinkedList() {
    }

    public int get(int index) {
      int k = 0;

      MyLinkedList curNode = head;

      while (curNode != null) {
        if (k == index) {
          return curNode.val;
        }
        k++;
        curNode = curNode.next;
      }

      return -1;
    }

    public void addAtHead(int val) {
      MyLinkedList newNode = new MyLinkedList();
      newNode.val = val;
      if (head != null) {
        newNode.next = head;
      }
      head = newNode;
    }

    public void addAtTail(int val) {
      MyLinkedList newNode = new MyLinkedList();
      newNode.val = val;

      MyLinkedList lastNode = head;
      if (head == null) {
        addAtHead(val);
      } else {
        while (lastNode != null) {
          if (lastNode.next == null)
            break;
          lastNode = lastNode.next;
        }
        lastNode.next = newNode;
      }
    }

    public void addAtIndex(int index, int val) {
      MyLinkedList newNode = new MyLinkedList();
      newNode.val = val;

      int k = 0;
      MyLinkedList curNode = head;
      MyLinkedList prevNode = null;

      while (curNode != null) {
        if (index == 0) {
          addAtHead(val);
          return;
        }

        if (k == index) {
          break;
        }

        k++;
        prevNode = curNode;
        curNode = curNode.next;
      }
      prevNode.next = newNode;
      newNode.next = curNode;
    }

    public void deleteAtIndex(int index) {
      int k = 0;

      MyLinkedList curNode = head;
      MyLinkedList prevNode = null;

      while (curNode != null) {
        if (index == 0) {
          head = head.next;
          return;
        }

        if (k == index) {
          break;
        }

        k++;
        prevNode = curNode;
        curNode = curNode.next;
      }
      prevNode.next = curNode.next;

    }

    public static void printLinkedList() {
      MyLinkedList temp = head;
      while (temp != null) {
        System.out.print(temp.val + " ");
        temp = temp.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
    // MyLinkedList n2 = new MyLinkedList(2);
    // MyLinkedList n3 = new MyLinkedList(3);
    // MyLinkedList n4 = new MyLinkedList(4);
    // n1.next = n2;
    // n2.next = n3;
    // n3.next = n4;
    myLinkedList.addAtHead(1);
    myLinkedList.addAtHead(2);
    myLinkedList.addAtHead(3);
    myLinkedList.addAtTail(4);
    myLinkedList.addAtIndex(1, 5);
    myLinkedList.addAtIndex(2, 7);
    myLinkedList.addAtIndex(5, 9);
    myLinkedList.addAtTail(8);
    myLinkedList.printLinkedList();
  }
}
