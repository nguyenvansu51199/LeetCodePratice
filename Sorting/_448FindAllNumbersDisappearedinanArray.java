package Sorting;

import java.util.ArrayList;
import java.util.List;

public class _448FindAllNumbersDisappearedinanArray {
  public static List<Integer> findDisappearedNumbers(int[] nums) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    boolean[] arr = new boolean[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      arr[nums[i]] = true;
    }

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == false) {
        list.add(i);
      }
    }
    return list;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 5, 4, 5, 6, 6, 8 };
    System.out.println(findDisappearedNumbers(a));

  }
}
