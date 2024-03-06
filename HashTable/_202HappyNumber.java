package HashTable;

import java.util.HashSet;
import java.util.Set;

public class _202HappyNumber {

  Set<Integer> mySet = new HashSet<>();

  public int isNumber(int n) {
    int result = 0;

    while (n != 0) {
      int k = n % 10;
      n = n / 10;
      result = (k * k) + result;
    }
    return result;
  }

  public boolean isHappy(int n) {

    while (mySet.contains(n) == false) {
      mySet.add(n);

      if (n == 1) {
        return true;
      }
      n = isNumber(n);

    }

    return false;
  }
}
