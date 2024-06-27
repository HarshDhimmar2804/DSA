package Recursion;

public class recursionProblem {
  public static int tillingProblem(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    // // for vertical
    // int fnm1 = tillingProblem(n - 1);

    // // for horizontal
    // int fnm2 = tillingProblem(n - 2);

    // // total choice
    // int totWays = fnm1 + fnm2;
    // return totWays;
    return tillingProblem(n - 1) + tillingProblem(n - 2);
  }

  public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
    if (idx == str.length()) {
      System.out.println(newStr);
      return;
    }

    char currChar = str.charAt(idx);
    if (map[currChar - 'a'] == true) {
      // duplicate
      removeDuplicates(str, idx + 1, newStr, map);
    } else {
      map[currChar - 'a'] = true;
      removeDuplicates(str, idx + 1, newStr.append(currChar), map);
    }
  }

  public static int friendsPairing(int n) {
    // Base case
    if (n == 1 || n == 2) {
      return n;
    }
    // // choice
    // // single
    // int fnm1 = friendsPairing(n - 1);
    // // pair
    // int fnm2 = friendsPairing(n - 2);
    // int pairWays = (n - 1) * fnm2;
    // // total choice
    // int totWays = fnm1 + pairWays;
    // return totWays;

    return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
  }

  public static void printBinStrings(int n, int lastPlace, String str) {
    // base case
    if (n == 0) {
      System.out.println(str);
      return;
    }
    // if (lastPlace == 0) {
    // // sit 0 on chair n
    // printBinStrings(n - 1, 0, str.append("0"));
    // printBinStrings(n - 1, 1, str.append("1"));
    // } else {
    // printBinStrings(n - 1, 0, str.append("0"));
    // }

    printBinStrings(n - 1, 0, str + "0");
    if (lastPlace == 0) {
      printBinStrings(n - 1, 1, str + "1");
    }
  }

  // starting index
  public static void occurenceIndex(int[] arr, int key, int start) {
    if (start == arr.length) {
      return;
    } // pre-order
    if (arr[start] == key) {
      System.out.print(start + " ");
    }
    occurenceIndex(arr, key, start + 1);
    return;
  }

  static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

  public static void printDigit(int num) {
    if (num == 0) {
      return;
    }
    int lastDigit = num % 10;
    printDigit(num / 10);
    System.out.print(digits[lastDigit] + " ");
  }

  static int total = 3;

  public static void towerOfHanoi(char src, char des, char aux, int n) {
    if (n == 0) {// base case
      return;
    }
    towerOfHanoi(src, aux, des, n - 1);// 1st faith (small disc src->aux)
    System.out.println((total - n + 1) + ". disc move from " + src + " tower to " + des + " tower");
    towerOfHanoi(aux, des, src, n - 1);// 2st faith (small disc aux->des)
  }

  public static void main(String[] args) {
    printDigit(1947);
    System.out.println();

    // towerOfHanoi('A', 'C', 'B', 3);

    // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
    // int key = 2;
    // occurenceIndex(arr, key, 0);

    // printBinStrings(3, 0, "");

    // System.out.println(friendsPairing(3));

    // String str = "appnnacollege";
    // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

    // System.out.println(tillingProblem(4));
  }
}
