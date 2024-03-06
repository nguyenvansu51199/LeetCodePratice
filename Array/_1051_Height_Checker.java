public class _1051_Height_Checker {
  public static int heightChecker(int[] a) {
    int n = a.length;
    int[] copied = new int[n];

    for (int i = 0; i < n; i++) {
      copied[i] = a[i];
    }

    int count = 0;
    for (int i = 0; i < copied.length - 1; i++) {
      for (int j = i; j < copied.length; j++) {
        if (copied[i] > copied[j]) {
          int temp = copied[i];
          copied[i] = copied[j];
          copied[j] = temp;
        }
      }
    }

    for (int k = 0; k < copied.length; k++) {
      if (a[k] != copied[k]) {
        count++;
      }
    }

    return count;

  }

  public static void main(String[] args) {
    int[] a = { 1, 1, 3, 5, 4, 2 };
    int[] b = { 5, 1, 2, 3, 4 };

    System.out.println(heightChecker(a));

    System.out.println(heightChecker(b));
  }
}
