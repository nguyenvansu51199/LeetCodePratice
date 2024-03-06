package String;

public class _387FirstUniqueCharacterinaString {
  public static int firstUniqChar(String s) {
    // String tro thanh mot mang char. moi phan tu la ma ASCII ung voi ky tu char
    char[] arr = s.toCharArray();
    int[] count = new int[123];

    for (int i = 0; i < arr.length; i++) {
      char c = arr[i];
      int index = (int) c;
      count[index]++;
    }

    for (char ar : arr) {
      System.out.printf("%s ", ar);
    }

    for (int j = 0; j < arr.length; j++) {
      char c = arr[j];
      int index = (int) c;
      if (count[index] == 1) {
        return j;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    String str = "eelo";
    System.out.println("\n" + firstUniqChar(str));
    // char a = 'l';
    // char b = 'l';
    // if (a == b) {
    // System.out.println("DOne");
    // } else {
    // System.out.println("Not");
    // }
  }
}
