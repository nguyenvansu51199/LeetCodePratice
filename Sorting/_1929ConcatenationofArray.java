package Sorting;

public class _1929ConcatenationofArray {
  public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int k = n;
    int[] arr = new int[n * 2];
    for (int i = 0; i < n; i++) {
      arr[i] = nums[i];
      arr[k] = nums[i];
      k++;
    }
    return arr;
  }

  public static void main(String[] args) {

  }
}
