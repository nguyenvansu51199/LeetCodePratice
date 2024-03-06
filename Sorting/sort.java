package Sorting;

public class sort {
  public static void bubbleSort(int[] a) {
    int n = a.length;

    for (int i = 0; i < n; i++) {
      boolean isSorted = true;
      for (int j = 1; j < n - i; j++) {
        if (a[j] < a[j - 1]) {
          isSorted = false;
          int temp = a[j];
          a[j] = a[j - 1];
          a[j - 1] = temp;
        }
      }
      if (isSorted) {
        break;
      }
    }

    for (int i : a) {
      System.out.printf("%d", i);
    }
  }

  public static void insertionSort(int[] a) {
    int n = a.length;
    System.out.println("Array init:");
    for (int i : a) {
      System.out.printf("%d ", i);
    }
    System.out.println("\n Array after:");

    for (int i = 1; i < n; i++) {
      int j = i - 1;
      int ai = a[i];
      while (j >= 0 && a[j] > ai) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = ai;
      for (int k : a) {
        System.out.printf("%d ", k);
      }
      System.out.println();

    }

  }

  public static void selectionSort(int[] a) {
    int n = a.length;

    for (int i = 0; i < n; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (a[j] < a[minIndex]) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        int temp = a[i];
        a[i] = a[minIndex];
        a[minIndex] = temp;
      }
      for (int j : a) {
        System.out.printf("%d ", j);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[] a = { 5, 3, 4, 5, 9, 12, 7 };
    selectionSort(a);
  }
}
