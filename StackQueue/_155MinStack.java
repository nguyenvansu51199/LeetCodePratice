package StackQueue;

import java.util.ArrayList;

public class _155MinStack {
  public class Node {
    int val;
    int min;
    Node next;

    Node(int val) {
      this.val = val;
    }

  }

  Node topNode;

  public _155MinStack() {
    topNode = null;
  }

  public void push(int val) {
    Node newNode = new Node(val);
    if (topNode == null) {
      newNode.min = val;
    } else {
      newNode.min = val < topNode.min ? val : topNode.min;
    }

    if (topNode != null) {
      newNode.next = topNode;
      topNode = newNode;
    } else {
      topNode = newNode;
    }

  }

  public void pop() {
    topNode = topNode.next;
  }

  public int top() {
    return topNode.val;
  }

  public int getMin() {
    return topNode.min;
  }

  public static void main(String[] args) {
    _155MinStack st = new _155MinStack();

  }
}
