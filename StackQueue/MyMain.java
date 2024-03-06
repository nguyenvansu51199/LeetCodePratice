package StackQueue;

public class MyMain {
  public static void main(String[] args) {
    // MyArrayStack mst = new MyArrayStack(3);
    // System.out.println(mst.isEmpty());
    // mst.push(1);
    // mst.show();
    // mst.push(2);
    // mst.show();
    // mst.push(3);
    // mst.show();
    // System.out.println("FULL: " + mst.isFull());

    // mst.push(4);
    // System.out.println(mst.isEmpty());

    // mst.pop();
    // mst.show();
    // mst.pop();
    // mst.show();
    // mst.pop();
    // mst.show();

    MyLinkedListStack mls = new MyLinkedListStack();
    mls.push(1);
    mls.push(2);
    mls.push(3);
    mls.show();

    mls.pop();
    mls.show();

  }
}
