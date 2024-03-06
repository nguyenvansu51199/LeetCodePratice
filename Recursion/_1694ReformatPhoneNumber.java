package Recursion;

public class _1694ReformatPhoneNumber {

  // Recursion
  public static String reformatNumber1(String number) {
    String str = number.replaceAll("[ -]", "");
    String s = subStr(str);
    return s;
  }

  public static String subStr(String s) {
    int n = s.length();
    if (n == 2 || n == 3) {
      return s;
    }
    if (n == 4) {
      return s.substring(0, 2) + "-" + s.substring(2);
    }
    return s.substring(0, 3) + "-" + subStr(s.substring(3));
  }

  // Not Recursion

  public static void main(String[] args) {
    String str = "12311";

    System.out.println(reformatNumber1(str));
  }
}
