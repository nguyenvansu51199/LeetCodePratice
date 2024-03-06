import java.lang.reflect.Array;
import java.util.Arrays;

public class _1089DuplicateZeros {
  public static void duplicateZeros(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        // Dich chuyen
        for (int j = n - 2; j >= i + 1; j--) {
          arr[j + 1] = arr[j];
        }

        // gan gia tri

        if (i + 1 < n) {

          arr[i + 1] = 0;
          i++;
        }
      }
    }

  }

  public static void main(String[] args) {
    int[] b = { 0, 0, 0 };
    duplicateZeros(b);
  }
}
