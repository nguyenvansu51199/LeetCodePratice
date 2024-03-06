package HashTable;

import java.util.HashMap;
import java.util.Map;

public class _677MapSumPairs {
  class MapSum {

    Map<String, Integer> myMap = new HashMap<>();

    public MapSum() {

    }

    public void insert(String key, int val) {
      myMap.put(key, val);
    }

    public int sum(String prefix) {
      int sum = 0;
      for (Map.Entry entry : myMap.entrySet()) {
        if (((String) entry.getKey()).startsWith(prefix) == true) {
          sum += (int) entry.getValue();
        }
      }

      return sum;
    }
  }
}
