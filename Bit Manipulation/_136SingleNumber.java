package Bit Manipulation;

public class _136SingleNumber {
  public int singleNumber(int[] nums) {
    int result = 0;
    for (int ai : nums) {
      result ^= ai;
    }
    return result;
  }
}
