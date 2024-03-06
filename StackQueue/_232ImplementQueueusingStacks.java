package StackQueue;

import java.util.Stack;

public class _232ImplementQueueusingStacks {
  class MyQueue {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> subStack = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
      mainStack.push(x);
    }

    public int pop() {
      if (subStack.isEmpty() == true) {
        while (mainStack.isEmpty() == false) {
          subStack.push(mainStack.pop());
        }
      }
      return subStack.pop();
    }

    public int peek() {
      if (subStack.isEmpty() == true) {
        while (mainStack.isEmpty() == false) {
          subStack.push(mainStack.pop());
        }
      }
      return subStack.peek();
    }

    public boolean empty() {
      if ((mainStack.isEmpty() == true) && (subStack.isEmpty() == true)) {
        return true;
      }
      return false;
    }
  }
}
