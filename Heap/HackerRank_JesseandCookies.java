package Heap;

import java.util.List;
import java.util.PriorityQueue;

public class HackerRank_JesseandCookies {
  PriorityQueue<Integer> myHeap = new PriorityQueue<>();

  public int cookies(int k, List<Integer> A) {
    int count = 0;
    for (Integer integer : A) {
      myHeap.add(integer);
    }

    while (myHeap.peek() < k) {
      if (myHeap.size() < 2) {
        return -1;
      }

      int first = myHeap.poll();
      int second = myHeap.poll();
      int newK = first + 2 * second;
      myHeap.add(newK);
      count++;
    }

    return count;

  }
}
