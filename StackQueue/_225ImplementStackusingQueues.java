package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class _225ImplementStackusingQueues {
  class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
      q1.add(x);
    }

    public int pop() {

      int val = -1;
      if (q1.isEmpty() == false) {
        while (q1.isEmpty() == false) {
          if (q1.size() == 1) {
            val = q1.remove();
          } else {
            q2.add(q1.remove());
          }
        }
      }
      Queue<Integer> temp = q1;
      q1 = q2;
      q2 = temp;
      return val;
    }

    public int top() {
      int val = -1;
      if (q1.isEmpty() == false) {
        while (q1.isEmpty() == false) {
          if (q1.size() == 1) {
            val = q1.remove();
            q2.add(val);
          } else {
            q2.add(q1.remove());
          }
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
      }

      return val;
    }

    public boolean empty() {
      if (q1.isEmpty() == true) {
        return true;
      }
      return false;
    }
  }

}
