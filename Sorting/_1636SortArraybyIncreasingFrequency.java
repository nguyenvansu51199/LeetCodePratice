package Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _1636SortArraybyIncreasingFrequency {
  public class Node implements Comparable {

    int value;
    int freq;

    Node(int v, int f) {
      this.value = v;
      this.freq = f;
    }

    @Override
    public int compareTo(Object o) {
      if (o instanceof Node) {
        Node other = (Node) o;
        if (this.freq == other.freq) {
          return -Integer.compare(this.value, other.value);
        }

        return Integer.compare(this.freq, other.freq);
      }
      return 0;
    }
  }

  public static int[] frequencySort(int[] nums) {
    int ADD_VALUE = 100;
    int MAX_VALUE = 100 + ADD_VALUE;
    // count[i] = số lần xuất hiện của i trong mảng
    int[] count = new int[MAX_VALUE + 1];

    // B0: Di dem so lan xuat hien cua cac phan tu
    for (int i = 0; i < nums.length; i++) {
      int convertedValue = nums[i] + ADD_VALUE;
      count[convertedValue]++;
    }

    List<Node> mList = new ArrayList<>();
    for (int convertedValue = 0; convertedValue <= MAX_VALUE; convertedValue++) {
      if (count[convertedValue] > 0) {
        int originValue = convertedValue - ADD_VALUE;
        Node newNode = new Node(originValue, count[convertedValue]);
        mList.add(newNode);
      }
    }

    Collections.sort(mList);

    int[] result = new int[nums.length];
    int idx = 0;

    for (Node node : mList) {
      int freq = node.freq;
      int value = node.value;
      for (int i = 0; i < freq; i++) {
        result[idx] = value;
        idx++;
      }
    }

    return result;
  }

  public static void main(String[] args) {

  }
}
