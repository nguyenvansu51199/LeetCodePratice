package BinarySearch;

public class myBinarySearch {

  // use loop while
  public static int search(int[] nums, int target) {
    int n = nums.length;
    int iLeft = 0;
    int iRight = n - 1;

    while (iLeft <= iRight) {
      int iMid = (iLeft + iRight) / 2;

      if (nums[iMid] == target) {
        return iMid;
      } else if (nums[iMid] > target) {
        iRight = iMid - 1;
      } else {
        iLeft = iMid + 1;
      }
    }
    return -1;
  }

  // use recursion
  public static int recursion(int[] a, int target, int iLeft, int iRight) {
    if (iLeft > iRight) {
      return -1;
    }

    int iMid = (iLeft + iRight) / 2;

    if (a[iMid] == target) {
      return iMid;
    } else if (a[iMid] > target) {
      return recursion(a, target, iLeft, iMid - 1);
    } else {
      return recursion(a, target, iMid + 1, iRight);
    }
  }

  public static int bSearch(int[] nums, int target) {
    int n = nums.length;
    int iLeft = 0;
    int iRight = n - 1;
    return recursion(nums, target, iLeft, iRight);
  }

  public static void main(String[] args) {
    int[] a = { 1, 3, 5, 8, 44, 66, 78 };
    System.out.println(bSearch(a, 67));

  }
}
