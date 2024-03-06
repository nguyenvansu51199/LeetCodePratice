package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _1046LastStoneWeight {

  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> myHeap = new PriorityQueue<>(Comparator.reverseOrder());
    for (int stone : stones) {
      myHeap.add(stone);
    }

    while (myHeap.size() > 1) {
      int bigger = myHeap.poll();
      int smaller = myHeap.poll();

      if (bigger != smaller) {
        myHeap.add(Math.abs(bigger - smaller));
      }
    }
    return myHeap.size() == 0 ? 0 : myHeap.poll();
  }
}
