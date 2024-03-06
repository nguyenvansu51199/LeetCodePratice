public class sort2 {
  public static int sort(int[] a, int L, int R, int key) {
    int iL = L;
    int iR = R;

    while (iL <= iR) {
      while (a[iL] < key) {
        iL++;
      }

      while (a[iR] > key) {
        iR--;
      }

      if (iL <= iR) {
        int temp = a[iL];
        a[iL] = a[iR];
        a[iR] = temp;
        iL++;
        iR--;
      }
    }

    return iL;
  }

  public static void quickS(int[] a, int L, int R) {
    if (L >= R) {
      return;
    }

    // chon key
    int key = a[(L + R) / 2];
    // sap xep theo key
    int k = sort(a, L, R, key);
    // chia ra
    quickS(a, L, k - 1);
    quickS(a, k, R);
  }

  public static int[] swap(int[] a1, int[] a2) {
    int n = a1.length + a2.length;
    int[] result = new int[n];

    int i1 = 0;
    int i2 = 0;
    int k = 0;

    while (k < n) {
      if (i1 < a1.length && i2 < a2.length) { // a1 va a2 deu != rong
        if (a1[i1] >= a2[i2]) {
          result[k] = a2[i2];
          k++;
          i2++;
        } else if (a1[i1] < a2[i2]) {
          result[k] = a1[i1];
          k++;
          i1++;
        }
      } else {
        if (i1 < a1.length) {
          result[k] = a1[i1];
          k++;
          i1++;
        } else {
          result[k] = a2[i2];
          k++;
          i2++;
        }
      }
    }

    return result;
  }

  public static int[] mergeS(int[] a, int L, int R) {
    if (L > R) {
      return new int[0];
    }

    if (L == R) {
      int[] singleElement = { a[L] };
      return singleElement;
    }

    int k = (L + R) / 2;

    int[] a1 = mergeS(a, L, k);
    int[] a2 = mergeS(a, k + 1, R);

    int[] result = swap(a1, a2);
    return result;
  }

  public static void main(String[] args) {
    int[] a = { 1, 5, 4, 3, 7, 8 };

    int[] b = mergeS(a, 0, a.length - 1);
    for (int i : b) {
      System.out.printf(i + " ");
    }
  }
}
