public class _88MergeArray {
  public static void merge2(int[] n1, int m, int[] n2, int n) {
        for (int ai : n2) {
          insertNum2(ai ,n1,m);
          m++;
        }
        
  }


  private static void insertNum2(int x, int[] a, int m) {
    boolean isInsertLastArr =false;
    for (int k = 0; k < m; k++) {
      
      if (a[k] > x) {
        isInsertLastArr = true;
        for (int i = m-1; i >= k; i--) {
          a[i+1] = a[i];
        
        }
        a[k] = x;
        break;
      }
    }

    if (isInsertLastArr == false) {

      a[m] = x; 
    }
  }
// kỹ thuật 2 con trỏ
  public static void merge(int[] n1, int m, int[] n2, int n) {
      int i = m - 1;
      int j = n - 1;
      int k = (m + n) - 1;

      while(k>=0) {
       if (j < 0) {
        n1[k] = n1[i];
        i--;
       } else if (i < 0) {
        n1[k] = n2[j];
        j--;
       } else if (n1[i] > n2[j]) {
        n1[k] = n1[i];
        i--;
       } else{
        n1[k] = n2[j];
        j--;
       }
        k--;
      }
        
  }


  public static void main(String[] args) {
    int[] n1 = {2,3,4 ,5,0,0,0};
    int[] n2 ={1, 3,6};
merge(n1, 4, n2, 3);
System.out.println("Done");
  }
}
