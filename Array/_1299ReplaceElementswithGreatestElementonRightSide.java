public class _1299ReplaceElementswithGreatestElementonRightSide {
  public static int[] replaceElements(int[] arr) {
    int n = arr.length;
    for (int i = n - 1; i >= 0; i--) {
      if (i != n - 1) {

        arr[i] = Math.max(arr[i], arr[i + 1]);
      }

    }

    for (int i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }

    if (n > 0) {
      arr[n - 1] = -1;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] a = { 17, 18, 5, 4, 6, 1 };
    int[] b = { 400 };
    replaceElements(b);
  }
}
