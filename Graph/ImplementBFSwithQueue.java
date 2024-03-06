package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ImplementBFSwithQueue {
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

    Set<Integer> mySet = new HashSet<>();
    Queue<Integer> myQueue = new LinkedList<>();
    mySet.add(0);
    myQueue.add(0);
    while (myQueue.isEmpty() == false) {
      int u = myQueue.remove();
      System.out.print(u + " ");
      for (int v = 0; v < arr.length; v++) {
        if (arr[u][v] == 1 && mySet.contains(v) == false) {
          myQueue.add(v);
          mySet.add(v);
        }
      }
    }
  }
}
