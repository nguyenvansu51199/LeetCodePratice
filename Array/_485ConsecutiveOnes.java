public class _485ConsecutiveOnes {
  public static int findMaxConsecutiveOnesV2(int[] a) {
      int count = 0;
      int lengthMax = 0;
      int n = a.length;
      for (int i = 0; i < n ; i++) {
       
        if (a[i] != 1) {
          count = 0;
        }
        if (a[i] == 1) {
          count++;
          lengthMax = count > lengthMax ? count : lengthMax;
        }

      }

    return lengthMax;
  }
  // recommend
  public static int findMaxConsecutiveOnes(int[] nums) {
    int l = 0, r = 0, maxOnes = 0;

    while (r < nums.length) {
        while (r < nums.length  && nums[r] == 1) {
            r++;
        }
        maxOnes = Math.max(maxOnes, r - l);
        r++;
        l = r;
    }
    return maxOnes;
}

  public static void main(String[] args) {
    int[] a = {1,1,0,1,1,1};
    int[] b = {1,0,0,0,0};
    int[] c = {1,1,0,1,1,1};
    int[] d = {1,0,1,1,0,1};
    System.out.println(findMaxConsecutiveOnes(a));
        System.out.println(findMaxConsecutiveOnes(b));
                System.out.println(findMaxConsecutiveOnes(c));
                 System.out.println(findMaxConsecutiveOnes(d));



  }
}
