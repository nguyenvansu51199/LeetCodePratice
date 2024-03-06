public class _283_MoveZeroes {
  public static void moveZeroes(int[] a) {
    int k = 0;
    int n = a.length;
    for (int i = 0; i < n; i++) {
      if (a[i] != 0) {
        a[k] = a[i];
        k++;
      }
    }

    for (; k < n; k++) {
      a[k] = 0;
    }

    for (int i : a) {
      System.out.printf("%d ", i);
    }
  }

  public static void main(String[] args) {
    int[] a = { 0, 1, 0, 3, 12 };
    int[] b = { 0, 1, 2, 3, };
    moveZeroes(a);
    System.out.println();
    moveZeroes(b);
  }
}
