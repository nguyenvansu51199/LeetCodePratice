package Recursion;

public class _344ReverseString {

  public static void change(char[] s, int i, int n, int k) {

    if (i >= k) {
      return;
    }

    char temp = s[i];
    s[i] = s[n];
    s[n] = temp;

    change(s, i + 1, n - 1, k);
  }

  public static void reverseStringV2(char[] s) {
    int i = 0;
    int n = s.length - 1;
    int k = s.length / 2;
    change(s, i, n, k);

    for (char c : s) {
      System.out.printf("" + c);
    }
  }

  public static void reverseString(char[] s) {
    int n = s.length - 1;
    for (int i = 0; i < n; i++) {
      char temp = s[i];
      s[i] = s[n];
      s[n] = temp;
      n--;
    }
    for (char c : s) {
      System.out.printf("" + c);
    }
  }

  public static void main(String[] args) {
    char[] c = { 'h', 'e', 'l', 'l', 'o', 'e' };
    reverseStringV2(c);
  }
}
