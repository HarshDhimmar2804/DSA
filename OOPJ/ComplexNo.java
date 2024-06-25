public class ComplexNo {
  public static void main(String[] args) {
    Complex a = new Complex(7, 8);
    Complex b = new Complex(2, 5);

    Complex m = Complex.add(a, b);
    m.printComplex();
    Complex n = Complex.sub(a, b);
    n.printComplex();
    Complex o = Complex.mul(a, b);
    o.printComplex();
  }
}

class Complex {
  int imag;
  int real;

  Complex(int i, int r) {
    imag = i;
    real = r;
  }

  public static Complex add(Complex a, Complex b) {
    Complex c = new Complex(0, 0);
    c.real = a.real + b.real;
    c.imag = a.imag + b.imag;
    return c;
  }

  public static Complex sub(Complex a, Complex b) {
    Complex c = new Complex(0, 0);
    c.real = a.real - b.real;
    c.imag = a.imag - b.imag;
    return c;
  }

  public static Complex mul(Complex a, Complex b) {
    int x = a.real;
    int y = a.imag;
    int p = b.real;
    int q = b.imag;
    Complex c = new Complex(0, 0);
    c.real = x * p - (y * q);
    c.imag = x * q + p * y;
    return c;
  }

  public void printComplex() {
    if (real == 0 && imag != 0) {
      System.out.println(imag + "i");
    } else if (imag == 0 && real != 0) {
      System.out.println(real);
    } else {
      System.out.printf("%d+%di\n", real, imag);
    }
  }
}