package HashTable;

import java.util.HashMap;
import java.util.Map;

public class _771JewelsandStones {
  public int numJewelsInStones(String jewels, String stones) {
    Map<Character, Integer> myMap = new HashMap<>();
    int count = 0;
    for (int i = 0; i < jewels.length(); i++) {
      Character ch = jewels.charAt(i);
      myMap.put(ch, 0);
    }

    for (int i = 0; i < stones.length(); i++) {
      Character ch = jewels.charAt(i);

      if (myMap.containsKey(ch) == true) {
        count++;
      }
    }

    return count;
  }
}
