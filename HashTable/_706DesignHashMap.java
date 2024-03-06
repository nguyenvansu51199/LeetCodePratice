package HashTable;

import java.util.ArrayList;

public class _706DesignHashMap {
  static class MyHashMap {
    /**
     * Data
     */
    public class Data {
      int key;
      int value;

      Data(int key, int value) {
        this.key = key;
        this.value = value;
      }

      @Override
      public boolean equals(Object other) {
        // TODO Auto-generated method stub
        if (other instanceof Data) {
          return this.key == ((Data) other).key;
        }

        return false;
      }
    }

    private final int SIZE = 1000;
    ArrayList<Data> myBucket[];

    public MyHashMap() {
      myBucket = new ArrayList[SIZE];

      for (int i = 0; i < myBucket.length; i++) {
        myBucket[i] = new ArrayList<>();
      }
    }

    public int hasFunction(int key) {
      return key % SIZE;
    }

    public void put(int key, int value) {
      int hashKeyIndex = hasFunction(key);
      ArrayList<Data> bucket = myBucket[hashKeyIndex];
      Data newData = new Data(key, value);
      int keyIndex = bucket.indexOf(newData);
      if (keyIndex >= 0) {
        bucket.get(keyIndex).value = value;
      } else {
        bucket.add(newData);
      }
    }

    public int get(int key) {
      int hashKeyIndex = hasFunction(key);
      ArrayList<Data> bucket = myBucket[hashKeyIndex];
      Data findData = new Data(key, 0);
      int keyIndex = bucket.indexOf(findData);
      if (keyIndex >= 0) {
        return bucket.get(keyIndex).value;
      }
      return -1;
    }

    public void remove(int key) {
      int hashKeyIndex = hasFunction(key);
      ArrayList<Data> bucket = myBucket[hashKeyIndex];
      Data newData = new Data(key, 0);
      bucket.remove(newData);
    }

  }

  public static void main(String[] args) {
    MyHashMap myMap = new MyHashMap();
    myMap.put(1, 1);
    myMap.put(1, 2);

    myMap.remove(1);
    myMap.remove(2);

  }
}
