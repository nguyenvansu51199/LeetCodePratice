package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _648ReplaceWords {
  Map<String, Integer> myMap = new HashMap<>();

  public String replaceWordsV2(List<String> dictionary, String sentence) {
    String[] arrS = sentence.split(" ");
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < arrS.length; i++) {
      for (int j = 0; j < arrS[i].length(); j++) {
        String prefix = arrS[i].substring(0, j + 1);
        if (dictionary.contains(prefix)) {
          arrS[i] = prefix;
          break;
        }
      }
      if (sb.length() == 0) {
        sb.append(arrS[i]);
      } else {
        sb.append(" ");
        sb.append(arrS[i]);

      }
    }
    return sb.toString();
  }

  public String replaceWords(List<String> dictionary, String sentence) {
    String[] arrS = sentence.split(" ");
    StringBuilder sb = new StringBuilder();
    Set<String> mySet = new HashSet<>();

    for (int i = 0; i < dictionary.size(); i++) {
      mySet.add(dictionary.get(i));
    }

    for (int i = 0; i < arrS.length; i++) {
      for (int j = 0; j < arrS[i].length(); j++) {
        String prefix = arrS[i].substring(0, j + 1);
        if (mySet.contains(prefix)) {
          arrS[i] = prefix;
          break;
        }
      }
      if (sb.length() == 0) {
        sb.append(arrS[i]);
      } else {
        sb.append(" ");
        sb.append(arrS[i]);

      }
    }
    return sb.toString();
  }

}
