package Recursion;

public class _509FibonacciNumber {
  public static int fib2(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 0) {
      return 0;
    }

    return fib(n - 1) + fib(n - 2);

  }

  static int[] F = new int[31];

  public static int fib(int n) {
    if (n < 2) {
      F[n] = n;
      return n;
    }

    F[n] = fib(n - 1) + fib(n - 2);

    return F[n];

  }

  public static void main(String[] args) {
    System.out.println(fib(9));
  }
}
