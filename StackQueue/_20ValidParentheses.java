package StackQueue;

public class _20ValidParentheses {
  public class myStack {
    /**
     * Node
     */
    public class Node {
      char val;
      Node next;

      Node(char val) {
        this.val = val;
      }

    }

    Node topNode;

    myStack() {
      topNode = null;
    }

    public boolean push(char val) {
      Node newNode = new Node(val);
      if (!isEmpty()) {
        newNode.next = topNode;
      }

      topNode = newNode;
      return true;
    }

    public char pop() {
      char value = topNode.val;
      topNode = topNode.next;
      return value;
    }

    public boolean isEmpty() {
      return topNode == null;
    }

  }

  public boolean isValid(String s) {
    int n = s.length();
    myStack mS = new myStack();
    for (int i = 0; i < n; i++) {
      char ch = s.charAt(i);
      if (ch == '{' || ch == '(' || ch == '[') {
        mS.push(ch);
      } else {
        if (mS.isEmpty()) {
          return false;
        }
        char prevChar = mS.pop();

        if ((ch == '}' && prevChar == '{') || (ch == ')' && prevChar == '(') || (ch == ']' && prevChar == '[')) {

        } else {
          return false;
        }
      }
    }
    return mS.isEmpty();
  }
}