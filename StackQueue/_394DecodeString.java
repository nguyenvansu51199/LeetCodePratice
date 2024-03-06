package StackQueue;

import java.util.Stack;

public class _394DecodeString {

  public static String decodeString(String s) {

    Stack<Character> myStack = new Stack<>();

    int n = s.length();

    for (int i = 0; i < n; i++) {
      char ch = s.charAt(i);
      if (ch == ']') {

        String str = "";
        while (myStack.peek() != '[') {
          str = myStack.pop() + str;
        }

        // Remove '['
        myStack.pop();

        // Get number
        String stringNumber = "";

        // Get number
        while (myStack.isEmpty() == false && (Character.isDigit(myStack.peek()) == true)) {
          stringNumber = myStack.pop() + stringNumber;
        }
        int numberLoop = Integer.parseInt(stringNumber);

        // Repeat String

        str = str.repeat(numberLoop);

        for (int j = 0; j < str.length(); j++) {
          char c = str.charAt(j);
          myStack.push(c);
        }

      } else {
        myStack.push(ch);
      }
    }

    String result = "";
    while (myStack.isEmpty() == false) {
      result = myStack.pop() + result;
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(decodeString("2[b]"));
  }

}
