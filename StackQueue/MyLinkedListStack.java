package StackQueue;

import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue {

  private class Node {
    private int val;
    Node next;

    Node(int val) {
      this.val = val;
    }
  }

  Node topNode;

  MyLinkedListStack() {
    topNode = null;
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub

    return topNode == null;
  }

  @Override
  public boolean isFull() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public int pop() {
    // TODO Auto-generated method stub
    if (!isEmpty()) {
      int value = topNode.val;
      topNode = topNode.next;
      return value;
    }
    return -1;
  }

  @Override
  public boolean push(int val) {
    // TODO Auto-generated method stub
    Node newNode = new Node(val);
    if (!isFull()) {
      newNode.next = topNode;
      topNode = newNode;
      return true;
    }
    return false;

  }

  @Override
  public void show() {
    // TODO Auto-generated method stub
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return;
    }

    ArrayList<Integer> nodeList = new ArrayList<>();
    Node temp = topNode;
    while (temp != null) {
      nodeList.add(temp.val);
      temp = temp.next;
    }

    for (int i = nodeList.size() - 1; i >= 0; i--) {
      System.out.printf("%d ", nodeList.get(i));
    }
    System.out.println();
  }

}
