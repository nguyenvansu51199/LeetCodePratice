package StackQueue;

public class MyArrayQueue implements IStackQueue {
  private int SIZE;
  private int[] arr;
  private int headIndex = -1;
  private int tailIndex = -1;

  MyArrayQueue(int size) {
    SIZE = size;
    arr = new int[SIZE];
  }

  @Override
  public boolean isEmpty() {
    if ((headIndex == -1) && (tailIndex == -1)) {
      return true;
    }
    return false;
  }

  @Override
  public boolean isFull() {
    return tailIndex == (SIZE - 1);
  }

  @Override
  public int pop() {
    int value = -1;

    if (isEmpty() == false) {
      value = arr[headIndex];
      headIndex++;
      if (headIndex > tailIndex) {
        headIndex = -1;
        tailIndex = -1;
      }
    }
    return value;
  }

  @Override
  public boolean push(int val) {
    if (isFull()) {
      return false;
    } else {
      if (isEmpty() == true) {
        headIndex++;
      }
      tailIndex++;
      arr[tailIndex] = val;
      return true;
    }
  }

  @Override
  public void show() {
    if (isEmpty()) {
      System.out.println("List is empty");
    } else {
      for (int i = headIndex; i < tailIndex; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }

  }

  public int count() {
    return tailIndex - headIndex + 1;
  }

}
