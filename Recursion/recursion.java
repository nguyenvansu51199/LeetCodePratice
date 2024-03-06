package Recursion;

public class recursion {
  // Su dung de quy phai co bai toan co so/ dieu kien dung

  // Tinh tong tu 1 den n
  public static int baiTap1(int n) {
    if (n == 0) {
      return 0;
    }
    int sum = n + baiTap1(n - 1);
    return sum;
  }

  // Tinh so mu
  public static int baiTap2(int n, int hat) {
    if (hat == 0) {
      return 1;
    }
    int multipy = n * baiTap2(n, hat - 1);

    return multipy;
  }

  // In ra so nguyen
  public static void printIntegerArray(int a, int b) {
    if (a > b) {
      return;
    }
    printIntegerArray(a + 1, b);

    System.out.println(a);

  }

  // Tim uoc chung lon nhat
  public static int findNumber(int a, int b) {
    int max = 1;
    int nChoosen = 0;
    nChoosen = a < b ? a : b;

    for (int i = 1; i < nChoosen; i++) {
      if (a % i == 0 && b % i == 0) {
        max = i;
      }
    }

    return max;
  }

  public static void main(String[] args) {
    // System.out.println(baiTap1(3));
    // System.out.println(baiTap2(2, 5));
    printIntegerArray(-10, 5);
    // System.out.println(findNumber(16, 32));
  }
}
