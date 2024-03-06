package Graph;

import java.util.HashSet;
import java.util.Set;

public class ImplementDFSwithRecursion {

  public static void DFS(int u, int[][] myArray, Set<Integer> mySet) {
    System.out.print(u + " ");
    for (int v = myArray.length - 1; v >= 0; v--) {
      if (myArray[u][v] == 1 && mySet.contains(v) == false) {
        mySet.add(v);
        DFS(v, myArray, mySet);
      }
    }
  }

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

    Set<Integer> mySet = new HashSet();
    mySet.add(0);
    DFS(0, arr, mySet);
  }
}
