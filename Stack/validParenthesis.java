import java.util.*;

public class validParenthesis {
  public static boolean isValid(String str) {// o(n)
    Stack<Character> s = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == '{' || ch == '(' || ch == '[') {// openning
        s.push(ch);
      } else {
        // closing
        if (s.isEmpty()) {
          return false;
        }
        if ((s.peek() == '{' && ch == '}') || (s.peek() == '(' && ch == ')') || (s.peek() == '[' && ch == ']')) {
          s.pop();
        } else {
          return false;
        }
      }
    }
    if (s.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isDuplicate(String str) {// o(n)
    Stack<Character> s = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      // closing
      if (ch == ')') {
        int count = 0;
        while (s.peek() != '(') {
          s.pop();
          count++;
        }
        if (count < 1) {// duplicate occure
          return true;
        } else {
          s.pop();// openning pair
        }
      } else {
        // openning
        s.push(ch);
      }
    }
    return false;
  }

  public static void maxArea(int arr[]) {// o(n)
    int maxArea = 0;
    int nsr[] = new int[arr.length];
    int nsl[] = new int[arr.length];

    // next smaller right //o(n)
    Stack<Integer> s = new Stack<>();
    for (int i = arr.length - 1; i >= 0; i--) {
      while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        nsr[i] = arr.length;
      } else {
        nsr[i] = s.peek();
      }
      s.push(i);
    }

    // next smaller left //o(n)
    s = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        nsl[i] = -1;
      } else {
        nsl[i] = s.peek();
      }
      s.push(i);
    }

    // current area : width = nsr[i] - nsl[i] - 1 //o(n)
    for (int i = 0; i < arr.length; i++) {
      int height = arr[i];
      int width = nsr[i] - nsl[i] - 1;
      int currArea = height * width;
      maxArea = Math.max(maxArea, currArea);
    }

    System.out.println("Max area in histogram = " + maxArea);
  }

  public static void main(String[] args) {
    // String str = "({})[]";// true
    // System.out.println(isValid(str));

    // valid string
    // String str = "((a+b))";// true
    // String str2 = "(a-b)";// false

    // System.out.println(isDuplicate(str));
    // System.out.println(isDuplicate(str2));

    int arr[] = { 2, 1, 5, 6, 2, 3 };// height in histogram
    maxArea(arr);
  }
}
