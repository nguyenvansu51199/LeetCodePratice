package StackQueue;

public class MyArrayStack implements IStackQueue {
  private int[] array;
  private int SIZE;
  private int topIndex = -1;

  MyArrayStack(int size) {
    this.SIZE = size;
    array = new int[SIZE];
  }

  @Override
  public boolean isEmpty() {
    if (topIndex < 0) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public boolean isFull() {
    return topIndex == SIZE - 1;
  }

  @Override
  public int pop() {
    if (!isEmpty()) {
      int value = array[topIndex];
      topIndex--;
      return value;
    }
    return -1;
  }

  @Override
  public boolean push(int val) {
    if (!isFull()) {
      topIndex++;
      array[topIndex] = val;
      return true;
    }
    return false;
  }

  @Override
  public void show() {
    if (!isEmpty()) {
      for (int i = 0; i <= topIndex; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    } else {
      System.out.println("List is empty");
    }

  }

}
