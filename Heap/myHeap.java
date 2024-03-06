package Heap;

public class myHeap {
  private int SIZE = 100;
  private int[] arr = new int[SIZE + 1];
  int size;

  public myHeap() {
    this.size = 0;
  }

  public boolean isEmpty() {
    return size <= 0;
  }

  public int peek() {
    return arr[1];
  }

  public void swap(int i, int j) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  public void add(int v) {
    size++;
    arr[size] = v;

    int curIndex = size;
    int parentIndex = curIndex / 2;
    while (parentIndex != 0 && arr[parentIndex] > arr[curIndex]) {
      swap(parentIndex, curIndex);
      curIndex = parentIndex;
      parentIndex = curIndex / 2;
    }
  }

  public void heapifyDown(int curIndex) {
    while ((2 * curIndex) <= size) {
      int childLeftIndex = curIndex * 2;
      int childRightIndex = childLeftIndex + 1;
      int childSmallIndex = childLeftIndex;
      if (childRightIndex <= size && arr[childRightIndex] < arr[childLeftIndex]) {
        childSmallIndex = childRightIndex;
      }
      if (arr[curIndex] > arr[childSmallIndex]) {
        swap(curIndex, childSmallIndex);
        curIndex = childSmallIndex;
      } else {
        break;
      }
    }
  }

  public int poll() {
    if (isEmpty() == true) {
      return -1;
    } else {
      int root = arr[1];
      arr[1] = arr[size];
      size--;
      int curIndex = 1;
      heapifyDown(curIndex);
      return root;
    }
  }

  public void remove(int v) {
    int curIndex = -1;
    for (int i = 1; i <= size; i++) {
      if (arr[i] == v) {
        curIndex = i;
      }
    }
    if (curIndex == -1) {
      return;
    } else {
      arr[curIndex] = arr[size];
      size--;
      heapifyDown(curIndex);
    }
  }
}
