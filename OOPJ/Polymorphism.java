package OOPS;

public class Polymorphism {
  public static void main(String[] args) {
    Deer d1 = new Deer();
    d1.eat();

    // Calculator calc = new Calculator();
    // System.out.println(calc.sum(5, 6));
    // System.out.println(calc.sum(5.5f, 6.8f));
    // System.out.println(calc.sum(5, 6, 7));
  }

}

// Method overriding
class Animal {
  void eat() {
    System.out.println("eating anything");
  }
}

class Deer extends Animal {
  void eat() {
    System.out.println("eating grass");
  }
}

// Method overloading
class Calculator {
  int sum(int a, int b) {
    return a + b;
  }

  float sum(float a, float b) {
    return a + b;
  }

  int sum(int a, int b, int c) {
    return a + b + c;
  }
}