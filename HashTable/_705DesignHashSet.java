package HashTable;

import java.util.ArrayList;

public class _705DesignHashSet {
  public static class MyHashSet {
    final int SIZE = 1000;
    ArrayList<Integer> myBucket[];

    public MyHashSet() {
      myBucket = new ArrayList[SIZE];
      for (int i = 0; i < myBucket.length; i++) {
        myBucket[i] = new ArrayList<>();
      }
    }

    public int hasFunction(int key) {
      return key % SIZE;
    }

    public void add(int key) {
      int hasValueIndex = hasFunction(key);
      ArrayList<Integer> bucket = myBucket[hasValueIndex];
      int keyIndex = bucket.indexOf(key);
      if (keyIndex < 0) {
        bucket.add(key);
      }
    }

    public void remove(int key) {
      int hasValueIndex = hasFunction(key);
      ArrayList<Integer> bucket = myBucket[hasValueIndex];
      int keyIndex = bucket.indexOf(key);
      if (keyIndex >= 0) {
        bucket.remove(keyIndex);
      }
    }

    public boolean contains(int key) {
      int hasValueIndex = hasFunction(key);
      ArrayList<Integer> bucket = myBucket[hasValueIndex];
      int keyIndex = bucket.indexOf(key);

      return keyIndex >= 0;

    }

  }

  public static void main(String[] args) {
    MyHashSet mySet = new MyHashSet();
    mySet.add(1);
    mySet.add(1);
    mySet.add(2);

  }
}
