import java.util.*;

public class twoDArray {
  public static boolean searching(int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.print("Found at: (" + i + "," + j + ")");
          return true;
        }
      }
    }
    System.out.println("Not Found");
    return false;
  }

  public static void spiral(int matrix[][]) {
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length - 1;
    int endCol = matrix[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {
      // top
      for (int j = startCol; j <= endCol; j++) {
        System.out.print(matrix[startRow][j] + " ");
      }
      // right
      for (int i = startRow + 1; i <= endRow; i++) {
        System.out.print(matrix[i][endCol] + " ");
      }
      // bottom
      for (int j = endCol - 1; j >= startCol; j--) {
        if (startRow == endRow) {
          break;
        }
        System.out.print(matrix[endRow][j] + " ");
      }
      // left
      for (int i = endRow - 1; i >= startRow + 1; i--) {
        if (startCol == endCol) {
          break;
        }
        System.out.print(matrix[i][startCol] + " ");
      }

      startRow++;
      startCol++;
      endRow--;
      endCol--;
    }
    System.out.println();
  }

  public static int diagonalSum(int[][] matrix) {
    int sum = 0;
    // for (int i = 0; i < matrix.length; i++) {//O(n^2)
    // for (int j = 0; j < matrix[0].length; j++) {
    // if (i == j) {
    // sum += matrix[i][j];
    // } else if (i + j == matrix.length - 1) {
    // sum += matrix[i][j];
    // }
    // }
    // }

    for (int i = 0; i < matrix.length; i++) {// O(n)
      // primary diagonal
      sum += matrix[i][i];
      // secondary diagonal
      if (i != matrix.length - 1 - i) {
        sum += matrix[i][matrix.length - i - 1];
      }
    }
    return sum;
  }

  public static boolean staircaseSearch(int[][] matrix, int key) {
    int row = 0;// this for (0,n) element
    int col = matrix.length - 1;
    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == key) {
        System.out.println("Found at: (" + row + "," + col + ")");
        return true;
      } else if (key < matrix[row][col]) {
        col--;
      } else {
        row++;
      }
    }
    // int row = matrix.length - 1;//this for (n,0) element
    // int col = 0;
    // while (col < matrix.length && row >= 0) {
    // if (matrix[row][col] == key) {
    // System.out.println("Found at: (" + row + "," + col + ")");
    // return true;
    // } else if (key < matrix[row][col]) {
    // row--;
    // } else {
    // col++;
    // }
    // }

    System.out.println("Not Found!");
    return false;
  }

  public static void main(String[] args) {
    // Transpose of a Matrix
    int[][] matrix = { { 2, 3, 7 }, { 5, 6, 7 } };
    int n = matrix.length;
    int m = matrix[0].length;
    int[][] transpose = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        transpose[i][j] = matrix[j][i];
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println();
    }

    // // sum of the numbers in the second row
    // int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
    // int sum = 0;
    // if (n <= 1) {
    // System.out.println("2nd row doesn't exist!");
    // }
    // for (int j = 0; j < nums[0].length; j++) {
    // sum += nums[1][j];
    // }
    // System.out.println(sum);

    // // find 7 from 2D matrix
    // int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
    // int count = 0;
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix[0].length; j++) {
    // if (matrix[i][j] == 7) {
    // count++;
    // }
    // }
    // }
    // System.out.println(count);
    // int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48
    // }, { 32, 33, 39, 50 } };
    // int key = 45;
    // System.out.println(staircaseSearch(matrix, key));
    // System.out.println(diagonalSum(matrix));
    // spiral(matrix);

    // int matrix[][] = new int[3][3];
    // int n = matrix.length, m = matrix[0].length;// n=row,m=col

    // Scanner sc = new Scanner(System.in);

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // matrix[i][j] = sc.nextInt();
    // }
    // }

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // System.out.print(matrix[i][j] + " ");
    // }
    // System.out.println();
    // }
    // searching(matrix, 9);
  }
}
