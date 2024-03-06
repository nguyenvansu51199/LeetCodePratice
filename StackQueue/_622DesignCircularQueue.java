package StackQueue;

public class _622DesignCircularQueue {
  class MyCircularQueue {
    int[] arr;
    int tail = -1;
    int head = -1;
    int count = 0;

    public MyCircularQueue(int k) {
      arr = new int[k];
    }

    public boolean enQueue(int value) {
      if (isFull() == true) {
        return false;
      } else {
        if (isEmpty()) {
          head = 0;
          tail = 0;
          arr[tail] = value;
        } else {
          tail++;
          if (tail > arr.length - 1) {
            tail = 0;
          }
          arr[tail] = value;
        }
        count++;
        return true;
      }
    }

    public boolean deQueue() {
      if (isEmpty()) {
        return false;
      } else {
        arr[head] = -1;
        head++;

        if (head > arr.length - 1) {
          head = 0;
        }

        count--;
        return true;
      }

    }

    public int Front() {
      if (isEmpty()) {
        return -1;
      }
      return arr[head];
    }

    public int Rear() {
      if (isEmpty()) {
        return -1;
      }
      return arr[tail];
    }

    public boolean isEmpty() {
      if (count > 0) {
        return false;
      }

      return true;
    }

    public boolean isFull() {
      if (count == arr.length)
        return true;

      return false;
    }
  }
}
