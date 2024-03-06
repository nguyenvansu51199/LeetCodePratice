package HashTable;

import java.util.HashMap;
import java.util.Map;

public class _1512NumberofGoodPairs {
  public int numIdenticalPairs(int[] nums) {
    Map<Integer, Integer> myMap = new HashMap<>();
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (myMap.containsKey(nums[i]) == true) {
        int soLanXuatHien = myMap.get(nums[i]);
        count += soLanXuatHien;
        myMap.put(nums[i], soLanXuatHien + 1);
      } else {
        myMap.put(nums[i], 1);
      }
    }

    return count;
  }
}
