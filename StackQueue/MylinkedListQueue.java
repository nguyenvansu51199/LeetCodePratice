package StackQueue;

public class MylinkedListQueue implements IStackQueue {
  /**
   * Node
   */

  public class Node {
    int val;
    Node next;

    Node(int val) {
      this.val = val;
    }
  }

  Node headNode;
  Node tailNode;

  MylinkedListQueue() {
    headNode = tailNode = null;
  }

  @Override
  public boolean isEmpty() {
    if (headNode == null && tailNode == null)
      return true;
    return false;
  }

  @Override
  public boolean isFull() {
    return false;
  }

  @Override
  public int pop() {
    if (isEmpty() == true) {
      return -1;
    } else {
      int val = headNode.val;
      if (headNode == tailNode) {
        headNode = tailNode = null;
      } else {
        headNode = headNode.next;
      }
      return val;
    }
  }

  @Override
  public boolean push(int val) {
    if (isFull() == true) {
      return false;
    } else {
      Node newNode = new Node(val);
      if (isEmpty() == false) {
        tailNode.next = newNode;
        tailNode = newNode;
      } else {
        headNode = tailNode = newNode;
      }
    }
    return true;
  }

  @Override
  public void show() {

    if (isEmpty()) {
      System.out.println("List is empty");
    } else {
      Node temp = headNode;
      while (temp != null) {
        System.out.print(temp.val + " ");
        temp = temp.next;
      }
    }
  }

}
