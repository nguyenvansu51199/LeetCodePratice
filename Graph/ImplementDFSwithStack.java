package Graph;

import java.util.Stack;

public class ImplementDFSwithStack {
  public static void main(String[] args) {
    int[][] arr = {
        { 0, 1, 0, 0, 0, 0, 0 },
        { 1, 0, 1, 1, 1, 0, 0 },
        { 0, 1, 0, 0, 0, 1, 0 },
        { 0, 1, 0, 0, 0, 1, 1 },
        { 0, 1, 0, 0, 0, 0, 1 },
        { 0, 0, 1, 1, 0, 0, 0 },
        { 0, 0, 0, 1, 1, 0, 0 }
    };

    Stack<Integer> myStack = new Stack<>();
    int[] myArray = new int[arr.length];
    myStack.add(0);
    myArray[0] = 0;
    while (myStack.isEmpty() == false) {
      int u = myStack.pop();
      System.out.print(u + " ");
      for (int v = 1; v < myArray.length; v++) {
        if (arr[u][v] == 1 && myArray[v] == 0) {
          myStack.add(v);
          myArray[v] = v;
        }
      }
    }
  }
}
