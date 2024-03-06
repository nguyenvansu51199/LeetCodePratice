public class _1672_Richest_Customer_Wealth {
  public static int maximumWealth(int[][] acc) {
    int a = acc.length;
    int b = acc[0].length;
    int max = 0;

    for (int i = 0; i < acc.length; i++) {
      int total = 0;
      for (int j = 0; j < acc[0].length; j++) {
        total += acc[i][j];
      }
      if (max < total) {
        max = total;
      }
    }
    

    return max;
  }

  public static void main(String[] args) {
    int[][] acc = {{1,2,3},{3,2,1}};

    System.out.println(maximumWealth(acc));
    System.out.println("DONE");
  }
}

