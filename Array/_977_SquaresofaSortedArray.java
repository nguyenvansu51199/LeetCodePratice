import java.lang.reflect.Array;

public class _977_SquaresofaSortedArray {
  public static int[] sortedSquares(int[] a) {
    int n = a.length - 1;
    int k = n;
    int i = 0;
    int[] cloneArr = new int[a.length];

    while (i <= n) {
      if (squareI(a[i]) > squareI(a[n])) {
        cloneArr[k] = squareI(a[i]);
        k--;
        i++;
      } else {
        cloneArr[k] = squareI(a[n]);
        k--;
        n--;
      }

    }

    return cloneArr;
  }

  public static int squareI(int i) {
    return i * i;
  }

  public static int[] sortedSquaresV2(int[] a) {

    int[] cloneArr = new int[a.length];
    int n = a.length;
    // Tim i và j
    // TIm i: là số âm cuối cùng trong day
    int i = -1;
    while ((i + 1) < n && a[i + 1] < 0) {
      i++;
    }

    // TIm j: la gia tri khong âm trái cùng trong dãy
    int j = n;
    while ((j - 1) >= 0 && a[j - 1] >= 0) {
      j--;
    }

    int k = 0; // Index of
    while (i >= 0 || j < n) {
      if (i >= 0 && j < n) // both i and j valid
      {
        int ii = a[i] * a[i];
        int jj = a[j] * a[j];

        if (ii <= jj) {
          cloneArr[k] = ii;
          i--;
          k++;
        } else {
          cloneArr[k] = jj;
          j++;
          k++;
        }
      } else if (i >= 0) { // only i valid
        cloneArr[k] = a[i] * a[i];
        i--;
        k++;
      } else { // only j valid
        cloneArr[k] = a[j] * a[j];
        j++;
        k++;
      }
    }

    for (int l : cloneArr) {
      System.out.printf("%d ", l);
    }
    return cloneArr;
  }

  public static void main(String[] args) {
    int[] a = { -3, -2, -1, 0, 5, 7 };
    System.out.println(sortedSquaresV2(a));
  }
}
