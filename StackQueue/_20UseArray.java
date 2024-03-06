package StackQueue;

public class _20UseArray {
  public class MyStackArray {
    char[] arr;
    int SIZE;
    int topIndex = -1;

    MyStackArray(int size) {
      SIZE = size;
      arr = new char[SIZE];
    }

    public boolean push(char val) {
      topIndex++;
      arr[topIndex] = val;
      return true;
    }

    public char pop() {
      if (topIndex != -1) {
        char value = arr[topIndex];
        topIndex--;
        return value;
      } else {
        return '0';
      }

    }

    public boolean isEmpty() {
      return topIndex == -1;
    }
  }

  public boolean isValid(String s) {
    int n = s.length();
    MyStackArray msa = new MyStackArray(n);
    for (int i = 0; i < n; i++) {
      char curChar = s.charAt(i);
      if (curChar == '{' || curChar == '(' || curChar == '[') {
        msa.push(curChar);
      } else {
        if (msa.topIndex == -1) {
          return false;
        }

        char prevChar = msa.pop();

        if ((curChar == ']' && prevChar == '[') || (curChar == '}' && prevChar == '{')
            || (curChar == ')' && prevChar == '(')) {

        } else {
          return false;
        }
      }
    }
    return msa.topIndex == -1;
  }
}
