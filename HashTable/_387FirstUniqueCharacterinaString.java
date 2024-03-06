package HashTable;

import java.util.HashMap;
import java.util.Map;

public class _387FirstUniqueCharacterinaString {
  public int firstUniqChar(String s) {
    Map<Character, Integer> myMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (myMap.containsKey(c) == false) {
        myMap.put(c, 1);
      } else {
        myMap.put(c, myMap.get(c) + 1);
      }
    }

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (myMap.get(c) == 1) {
        return i;
      }
    }
    return -1;
  }
}
