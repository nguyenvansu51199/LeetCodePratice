public class _1295_FindNumbers {
  public static int findNumbers(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if(isNumber(num)) {
        count++;
      }
    }
        
    return count;
  }

  public static boolean isNumber(int num) {
    int result = 0;
    int current = num;
    int count = 0;
    while(current != 0) {
      result = current / 10;
      current = result;
      count++;
    }
    if (count % 2 == 0) {
      return true;
    } else return false;
  }

  public static void main(String[] args) {
    int [] nums = {1,34,12,123,243};

    System.out.println(findNumbers(nums));
  }
}
