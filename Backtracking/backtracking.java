public class backtracking {
  public static void changeArr(int[] arr, int i, int val) {
    // base case
    if (i == arr.length) {
      printArray(arr);
      return;
    }
    // recursion
    arr[i] = val;
    changeArr(arr, i + 1, val + 1);// func call
    arr[i] = arr[i] - 2;// backtracking
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void findSubset(String str, String ans, int i) {
    if (i == str.length()) {
      if (ans.length() == 0) {
        System.out.println("null");
      } else {
        System.out.println(ans);
      }
      return;
    }
    // yes choice
    findSubset(str, ans + str.charAt(i), i + 1);
    // no choce
    findSubset(str, ans, i + 1);
  }

  public static void findPermutation(String str, String ans) {// T(c)=o(n*n!)
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }
    for (int i = 0; i < str.length(); i++) {
      char curr = str.charAt(i);
      // "abcde" => "ab"+"de" = "abde"
      String newStr = str.substring(0, i) + str.substring(i + 1);
      findPermutation(newStr, ans + curr);
    }
  }

  public static void main(String[] args) {
    String str = "abc";
    findPermutation(str, "");

    // findSubset(str, "", 0);

    // int[] arr = new int[5];
    // // T(c)=o(n)
    // changeArr(arr, 0, 1);
    // printArray(arr);
  }
}
