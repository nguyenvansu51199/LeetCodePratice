public class _724FindPivotIndex {
  public static int pivotIndex(int[] a) {
    int n = a.length;
    int[] sl = new int[n];
    int[] sr = new int[n];

    for (int i = 0; i < n; i++) {
      int j = n - 1 - i;
      sl[i] = i == 0 ? a[i] : sl[i - 1] + a[i];
      sr[j] = j == n - 1 ? a[j] : sr[j + 1] + a[j];
    }

    for (int k = 0; k < n; k++) {
      if (sl[k] == sr[k])
        return k;
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] a = { 1, 5, 6, 6, 7, 5 };
    int[] b = { 1, 2, 3 };
    int[] c = { 1, 4, 6, 7, 10, 1 };
    int[] d = { 2, 1, -1 };
    System.out.println(pivotIndex(a));
    System.out.println(pivotIndex(b));
    System.out.println(pivotIndex(c));
    System.out.println(pivotIndex(d));

  }
}
