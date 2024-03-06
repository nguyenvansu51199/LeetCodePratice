package LinkedList;

public class myLinkedList {
  /**
   * Node
   */
  public static class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }

  }

  public static Node addHead(Node headNode, int value) {
    Node newNode = new Node(value);
    if (headNode == null) {
      return newNode;
    } else {
      newNode.next = headNode;
    }

    return newNode;
  }

  public static Node addTail(Node headNode, int value) {
    Node lastNode = new Node(value);
    Node temp = headNode;
    if (headNode == null) {
      return addHead(headNode, value);
    } else {
      while (temp.next != null) { // cẩn thận hỏng kiến thức =))
        temp = temp.next;

      }
      temp.next = lastNode;
    }

    return headNode;
  }

  public static Node addToIndex(Node headNode, int value, int index) {

    if (headNode == null || index == 0) {
      return addHead(headNode, value);
    } else {
      Node newNode = new Node(value);
      int count = 0;
      Node temp = headNode;
      while (temp != null) {
        count++;
        if (count == index) {
          newNode.next = temp.next;
          temp.next = newNode;
          break;
        }
        temp = temp.next;
      }

    }

    return headNode;
  }

  public static Node deleteHead(Node headNode) {

    if (headNode != null) {
      return headNode.next;
    }
    return headNode;
  }

  // public static Node deleteTail(Node headNode) {
  // Node temp = headNode;
  // while (temp != null) {
  // if (temp.next.next == null) {
  // temp.next = null;
  // break;
  // }
  // temp = temp.next;
  // }
  // return headNode;
  // }

  public static Node removeTail(Node headNode) {

    if (headNode == null) {
      return null;
    }

    Node lastNode = headNode;
    Node prevNode = null;

    while (lastNode.next != null) {
      prevNode = lastNode;
      lastNode = lastNode.next;
    }

    if (prevNode == null) {
      return null;
    } else {
      prevNode.next = null;
    }

    return headNode;
  }

  // public static Node removeAtIndex(Node headNode, int index) {
  // if (index == 0) {
  // return deleteHead(headNode);
  // } else {

  // Node prevNode = headNode;
  // Node temp = headNode;
  // int count = 0;

  // while (temp != null) {

  // prevNode = temp;
  // temp = temp.next;
  // count++;
  // if (count == index) {
  // prevNode.next = temp.next;
  // break;
  // }
  // }

  // }

  // return headNode;
  // }

  public static Node removeAtIndex(Node headNode, int index) {
    if (headNode == null || index < 0)
      return null;

    if (index == 0) {
      return deleteHead(headNode);
    } else {

      Node prevNode = null;
      Node currNode = headNode;
      int count = 0;
      boolean bIsFound = false;

      while (currNode != null) {

        if (count == index) {
          // Remove currNode
          bIsFound = true;
          break;
        }
        prevNode = currNode;
        currNode = currNode.next;
        count++;
      }

      if (bIsFound) {
        if (prevNode == null) {
          return null;
        } else {
          if (currNode != null) {
            prevNode.next = currNode.next;
          }
        }
      }

    }

    return headNode;

  }

  public static void printLinkedList(Node headNode) {
    Node temp = headNode;

    if (headNode == null) {
      System.out.println("List is empty");
    }

    while (temp != null) {
      System.out.print(temp.value);
      temp = temp.next;
      if (temp != null) {
        System.out.printf("->");
      } else {
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    n1.next = n2;
    n2.next = n3;

    n1 = addHead(n1, 5);
    n1 = addTail(n1, 6);
    n1 = addToIndex(n1, 9, 3);
    n1 = addToIndex(n1, 8, 0);
    n1 = addToIndex(n1, 18, 0);

    // n1 = deleteHead(n1);
    // n1 = removeTail(n1);
    // n1 = removeAtIndex(n1, 0);
    n1 = removeAtIndex(n1, 1);
    n1 = removeAtIndex(n1, 6);
    n1 = removeAtIndex(n1, 0);

    printLinkedList(n1);
  }
}
