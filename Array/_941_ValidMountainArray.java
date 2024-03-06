public class _941_ValidMountainArray {
  public static boolean validMountainArray(int[] a) {
    if (a.length < 3)
      return false;
    boolean b = false;
    boolean c = false;
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i + 1] - a[i] == 0)
        return false;

      if ((a[i + 1] - a[i] < 0) && b == false) {
        return false;
      }

      if (a[i + 1] - a[i] > 0 && c == true) {
        return false;
      }

      if (a[i + 1] - a[i] > 0 && b == false) {
        b = true;
      }

      if ((a[i + 1] - a[i] < 0) && b == true) {
        c = true;
      }

    }
    if (b == true && c == true) {
      return true;
    }

    return false;
  }

  public static boolean validMountainArray3(int[] a) {
    int n = a.length;
    if (n < 3)
      return false;
    boolean isInsreasing = true;
    for (int i = 0; i < n - 1; i++) {
      int j = i + 1;

      if (a[i] > a[j]) {
        if (isInsreasing == false) {
          // normal
        } else // isInsreasing = true
        {
          if (i == 0) {
            return false;
          }
          isInsreasing = false;
        }
      } else if (a[i] < a[j]) // Day tang
      {
        if (isInsreasing == true) {
          // normal
        } else // isInsreasing = false: Day dang xet la day giam
        {
          return false;
        }
      } else // a[i] == a[j]
      {
        return false;
      }

    }

    if (isInsreasing == false) // Day dang xet cuoi cung la day giam
    {
      return true;
    }

    return false;
  }

  public static boolean validMountainArrayV2(int[] A) {
    int n = A.length, i = 0, j = n - 1;
    while (i + 1 < n && A[i] < A[i + 1])
      i++;
    while (j > 0 && A[j - 1] > A[j])
      j--;
    return i > 0 && i == j && j < n - 1;
  }

  public static void main(String[] args) {
    int[] a = { 1, 5 };
    int[] b = { 1, 1, 4, 5, 2 };
    int[] c = { 1, 2, 3, 4, 2, 5 };
    int[] d = { 1, 2, 3, 4, 2, 1 };

    System.out.println(validMountainArrayV2(a));
    System.out.println(validMountainArrayV2(b));
    System.out.println(validMountainArrayV2(c));
    System.out.println(validMountainArrayV2(d));
  }
}
