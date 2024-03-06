public class _852PeakIndexinaMountainArray {
  public static int peakIndexInMountainArray(int[] a) {
    int n = a.length;
    int max = a[0];
    int index = 0;
    for (int i = 1; i < n - 1; i++) {
      if (a[i] > max) {
        max = a[i];
        index = i;
      }
    }
    return index;
  }

  public static int peakIndexInMountainArrayV2(int[] a) {
    int n = a.length;
    for (int i = 1; i < n - 1; i++) {
      if (a[i + 1] < a[i])
        return i;
    }

    return 1;
  }

  public static int peakIndexInMountainArrayV3(int[] a) {
    int n = a.length;
    int mid = n / 2;
    int max = 0;
    if (a[mid] > a[mid + 1]) {
      for (int i = 0; i < mid + 1; i++) {
        if (a[i + 1] < a[i])
          return i;
      }
    } else {
      for (int j = mid + 1; j < n - 1; j++) {
        if (a[j + 1] < a[j])
          return j;
      }
    }

    return 1;
  }

  public static int peakIndexInMountainArrayV4(int[] a) {
    int L = 0;
    int R = a.length - 1;
    int index = find(a, L, R);

    return index;
  }

  public static int find(int[] a, int L, int R) {
    // Kiem tra tinh hop le
    // L -- R 012

    if (R - L >= 2) {
      int i = (R + L) / 2;
      if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
        return i;
      } else if (a[i - 1] < a[i]) { // di chuyen sang ben phai
        return find(a, i, R);
      } else { // di chuyen sang ben trai
        return find(a, L, i);
      }
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    int[] a = { 0, 2, 5, 8, 10, 4, 3 };
    int[] b = { 1, 5, 9, 3 };
    System.out.println(peakIndexInMountainArrayV3(b));

  }
}
