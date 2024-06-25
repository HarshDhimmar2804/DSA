import java.util.*;

public class JavaBasic {
  public static void binTodec(int bin) {
    int pow = 0;
    int deci = 0;
    while (bin > 0) {
      int ldigit = bin % 10;
      deci = deci + (ldigit * (int) Math.pow(2, pow));
      pow++;
      bin = bin / 10;
    }
    System.out.println(deci);
  }

  public static void decTobin(int dec) {
    int pow = 0;
    int bin = 0;
    while (dec > 0) {
      int ldigit = dec % 2;
      bin = bin + (ldigit * (int) Math.pow(10, pow));
      pow++;
      dec = dec / 2;
    }
    System.out.println(bin);
  }

  public static void main(String[] args) {
    decTobin(45);

    // subArray(numbers);
    // pair(numbers);
    // reverse(numbers);
    // for (int i = 0; i < numbers.length; i++) {
    // System.out.print(numbers[i] + " ");
    // }
    // System.out.println();
    // int key = 10;

    // System.out.println("Index for key: " + binarySearch(numbers, key));

    // int larbeNum = largest(numbers);
    // System.out.println(larbeNum);

    // String menu[] = { "Dhosa", "Chole", "Paneer", "Aloo", "Samosa" };
    // String key = "Paneer";
    // int result = linearSearch(menu, key);
    // if (result != -1) {
    // System.out.println("Found at index: " + result);
    // } else {
    // System.out.println("Not found");
    // }

    // int n = 5;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // if (col - row == 0 || col + row == n + 1) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }

    // int n = 5;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // if (row == 1 || row == n || col == 1 || col == n) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }

    // int n = 5;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // if (col + row <= n + 1) {
    // System.out.print(col);
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }

    // int n = 5;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // if (row >= col) {
    // if ((row + col) % 2 == 0) {
    // System.out.print("1 ");
    // } else {
    // System.out.print("0 ");
    // }
    // }
    // }
    // System.out.println();
    // }

    // int n = 5;
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // if (col + row >= n + 1) {
    // System.out.print("* ");
    // } else {
    // System.out.print(" ");
    // }
    // }

    // System.out.println();
    // }

    // binTodec(1010);

    // decTobin(10);
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter number:");
    // int n = sc.nextInt();
    // int i = 1;
    // while (i <= n) {
    // System.out.println(i);
    // i++;
    // }

    // int n = 10;
    // char ch = 'A';
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(ch);
    // }
    // System.out.println();
    // ch++;
    // }

    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n; j++) {
    // if (j - i == 0 || i + j == n + 1) {
    // System.out.print("*");
    // } else {
    // System.out.print("_");
    // }
    // }
    // System.out.println();
    // }

  }
}