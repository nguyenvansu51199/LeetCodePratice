package Sorting;

public class _2164SortEvenandOddIndicesIndependently {
  public static void printArr(int[] arr) {
    System.out.println();
    for (int i : arr) {
      System.out.printf(i + " ");
    }
  }

  public static int[] sortEvenOdd(int[] nums) {

    int n = nums.length;

    int[] odd = null;
    int[] even = null;

    if (n % 2 == 0) {
      odd = new int[n / 2];
      even = new int[n / 2];
    } else {
      odd = new int[(n / 2)];
      even = new int[(n / 2) + 1];
    }

    for (int i = 0; i < nums.length; i++) {
      int value = nums[i];
      int kEven = 0;
      int kOdd = 0;

      if (i % 2 == 0) {

        while (kEven < even.length) {
          if (value < even[kEven]) {
            for (int j = even.length - 1; j > kEven; j--) {
              even[j] = even[j - 1];
            }
            break;
          } else if (even[kEven] == 0) {
            break;
          } else {
            kEven++;
          }
        }
        even[kEven] = value;
        // print
        // printArr(even);
      } else {
        while (kOdd < odd.length) {
          if (value > odd[kOdd]) {
            for (int j = odd.length - 1; j > kOdd; j--) {
              odd[j] = odd[j - 1];
            }
            break;
          } else {
            kOdd++;
          }
        }
        odd[kOdd] = value;

        // print
        printArr(odd);
      }
    }
    int a = 0;
    int b = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i % 2 == 0) {

        nums[i] = even[a];
        a++;
      } else {
        nums[i] = odd[b];
        b++;
      }
    }

    // for (int i : nums) {
    // System.out.printf(i + " ");
    // }

    return nums;
  }

  public static void main(String[] args) {
    int[] a = { 11, 15, 9, 35, 0, 9, 0, 6, 0, 12 };
    sortEvenOdd(a);
  }
}
