public class nQueens {
  public static boolean isSafe(char board[][], int row, int col) {
    // vertical up
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }
    // diag left up
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    // diag right up
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }

  static int count = 0;

  public static void nQueen(char board[][], int row) {
    // base case
    if (row == board.length) {
      // printBoard(board);
      count++;
      return;
    }
    // column loop
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
        nQueen(board, row + 1);// func call
        board[row][j] = 'X';// backtracking step
      }
    }
  }

  public static boolean nQueen1(char board[][], int row) {
    // base case
    if (row == board.length) {
      // printBoard(board);
      count++;
      return true;
    }
    // column loop
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
        if (nQueen1(board, row + 1)) {
          return true;
        }
        board[row][j] = 'X';// backtracking step
      }
    }
    return false;
  }

  public static void printBoard(char board[][]) {
    System.out.println("-------- Chess Board --------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 4;
    char board[][] = new char[n][n];
    // initialise
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'X';
      }
    }
    if (nQueen1(board, 0)) {
      System.out.println("Soln is possible");
      printBoard(board);
    } else {
      System.out.println("Soln is not possible");
    }
    // nQueen(board, 0);
    // System.out.println("Total ways to solve n queens = " + count);
  }
}
