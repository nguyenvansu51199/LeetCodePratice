package String;

public class _1221SpliaStringinBalancedStrings {
  public static int balancedStringSplit(String s) {
    char[] arr = s.toCharArray();
    int nL = 0;
    int nR = 0;
    int count = 0;

    for (int i = 0; i < arr.length; i++) {

      if (arr[i] == 'L') {
        nL++;
      } else {
        nR++;
      }

      if (nL == nR) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    String s = "RLRRRLLRLL";
    System.out.println(balancedStringSplit(s));
  }
}
