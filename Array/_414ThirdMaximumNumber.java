public class _414ThirdMaximumNumber {
  public static void insert(long[] maxArray, int val) {
    int index = 0;
    int n = maxArray.length;
    while (index < n) {
      if (maxArray[index] == val) {
        return;
      }

      if (maxArray[index] < val) {

        break;
      }

      if (maxArray[index] > val) {
        index++;
      }
    }

    if (index < maxArray.length) {
      for (int i = n - 1; i > index; i--) {
        maxArray[i] = maxArray[i - 1];
      }
      maxArray[index] = val;
    }
    for (long l : maxArray) {
      System.out.printf("%d ", l);
    }
    System.out.println();
  }

  public static int thirdMax(int[] nums) {
    int n = nums.length;
    long[] maxArray = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
    for (int i = 0; i < n; i++) {
      insert(maxArray, nums[i]);
    }
    ;

    if (maxArray[2] == Long.MIN_VALUE) {
      return (int) maxArray[0];
    }

    return (int) maxArray[2];

  }

  public static void main(String[] args) {
    int[] a = { 2, 6, 6, 5, 6, 8, 11 };
    // thirdMax(a);
    System.out.println(thirdMax(a));

  }
}
