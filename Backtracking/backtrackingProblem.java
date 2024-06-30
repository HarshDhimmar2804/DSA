public class backtrackingProblem {
  final static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
      { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' }
  };

  public static void letterCombination(String D) {
    int len = D.length();
    if (len == 0) {
      System.out.println("");
      return;
    }
    recursion(0, len, "", D);
  }

  public static void recursion(int i, int len, String s, String D) {
    if (i == len) {
      System.out.println(s);
    } else {
      char[] letters = L[Character.getNumericValue(D.charAt(i))];
      for (int j = 0; j < letters.length; j++) {
        recursion(i + 1, len, s + letters[j], D);
      }
    }
  }

  public static void main(String[] args) {
    letterCombination("24");
  }
}
