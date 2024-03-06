package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1365HowManyNumbersAreSmallerThantheCurrentNumber {
  public int[] smallerNumbersThanCurrentV2(int[] nums) {
    Map<Integer, Integer> myMap = new HashMap<>();
    int n = nums.length;
    int[] result = new int[n];

    int[] arr = Arrays.copyOf(nums, n);
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      if (myMap.containsKey(arr[i]) == false) {
        myMap.put(arr[i], i);
      }
    }

    for (int i = 0; i < result.length; i++) {
      result[i] = myMap.get(nums[i]);
    }

    return result;

  }

  public int[] smallerNumbersThanCurrentV3(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    Map<Integer, Integer> myMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
          count++;
        }
      }
      myMap.put(nums[i], count);
    }

    for (int i = 0; i < result.length; i++) {
      result[i] = myMap.get(nums[i]);
    }

    return result;

  }

  public int[] smallerNumbersThanCurrentV3(int[] nums) {
    int[] count = new int[101];
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      count[nums[i]]++;
    }

    for (int i = 0; i < result.length; i++) {

      for (int j = 0; j < count[i]; j++) {
        result[i] += count[j];
      }
    }
    return result;

  }
}
