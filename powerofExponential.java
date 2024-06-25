public class powerofExponential {

  public static boolean isPowerOfTwo(int n) {
    return n>0 && (n&(n-1))==0;
  }
  public static boolean isPowerOfFour(int n) {
    return n>0 && (n&(n-1))==0 && (n&0xAAAAAAAA)==0;
  }
  public static void main(String[] args) {
    // System.out.println(isPowerOfTwo(8));
    System.out.println(isPowerOfFour(16));
  }
}
