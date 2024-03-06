package String;

public class _1816TruncateSentence {
  public static String truncateSentence(String s, int k) {
    int count = 0;
    s = s + " ";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        count++;
      }
      if (count == k) {
        return s.substring(0, i);
      }
    }

    return "";
  }

  public static void main(String[] args) {
    String a = "qqq www qq c d e";
    System.out.println(truncateSentence(a, 4));
  }
}
