public class BitManipulation {

  public static void oddEven(int n) {
    int bitMask = 1;
    if ((n & bitMask) == 0) {
      // even
      System.out.println("even number");
    } else {
      // odd
      System.out.println("odd number");
    }
  }

  public static int getIthEle(int n, int i) {
    int bitMask = 1 << i;
    if ((n & bitMask) == 0) {
      return 0;
    } else {
      return 1;
    }
  }

  public static int setIthEle(int n, int i) {
    int bitMask = 1 << i;
    return n | bitMask;
  }

  public static int clearIthEle(int n, int i) {
    int bitMask = ~(1 << i);
    return n & bitMask;
  }

  public static int updateIthEle(int n, int i, int newBit) {
    // Approach: 1
    // if (newBit == 0) {
    // return clearIthEle(n, i);
    // } else {
    // return setIthEle(n, i);
    // }

    // Approach:2
    n = clearIthEle(n, i);
    int BitMask = newBit << i;
    return n | BitMask;
  }

  public static int clearLastIthEle(int n, int i) {
    int bitMask = (~0) << i;
    return n & bitMask;
  }

  public static int cleaBitsinRange(int n, int i, int j) {
    int a = ((~0) << (j + 1));
    int b = (1 << i) - 1;
    int bitMask = a | b;
    return n & bitMask;
  }

  public static boolean isPowerOfTwo(int n) {
    return (n & (n - 1)) == 0;
  }

  public static int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
      if ((n & 1) != 0) {
        count++;
      }
      n = n >> 1;
    }
    return count;
  }

  public static int fastExpo(int a, int n) {
    int ans = 1;
    while (n > 0) {
      if ((n & 1) != 0) {// check LSB
        ans = ans * a;
      }
      a = a * a;
      n = n >> 1;
    }
    return ans;
  }

  public static void main(String[] args) {
    // System.out.println(getIthEle(10, 1));
    // System.out.println(setIthEle(10, 2));
    // System.out.println(clearIthEle(10, 1));
    // System.out.println(updateIthEle(10, 2, 1));
    // System.out.println(clearLastIthEle(15, 2));
    // System.out.println(cleaBitsinRange(10, 2, 4));
    // System.out.println(isPowerOfTwo(8));
    // System.out.println(countSetBits(10));
    System.out.println(fastExpo(3, 5));

    // oddEven(3);
    // oddEven(11);
    // oddEven(14);

    // System.out.println(5 & 6);// 4
    // System.out.println(5 | 6);// 7
    // System.out.println(5 ^ 6);// 3
    // System.out.println((~5));// -6
    // System.out.println((~0));// -1
    // System.out.println(5 << 2);// 20
    // System.out.println(6 >> 1);// 3
  }
}
