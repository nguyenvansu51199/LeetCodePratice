public class _66PlusOne {
  public static int[] plusOne(int[] digits) {
    int n = digits.length;
    int i = n - 1;
    int rest = 1;

    while (i >= 0 && rest > 0) {
      int temp = digits[i] + rest;
      digits[i] = temp % 10;
      rest = temp / 10;
      i--;
    }

    if (rest == 0) {
      return digits;
    }

    int[] b = new int[n + 1];
    b[0] = rest;

    for (int j = 0; j < n; j++) {
      b[j + 1] = digits[j];
    }

    return b;
  }

  public static void main(String[] args) {
    int[] a = { 7, 9, 9 };
    plusOne(a);

    // System.out.println(123 / 100);
  }
}
