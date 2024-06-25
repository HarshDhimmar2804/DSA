public class Abstraction {
  public static void main(String[] args) {
    Mustang myHorse = new Mustang();
    // Animal->Horse->Mustang

    // Horse h = new Horse();
    // h.eat();
    // h.walk();
    // System.out.println(h.color);

    // Chicken c = new Chicken();
    // c.eat();
    // c.walk();
  }

}

abstract class Animal {
  String color;

  Animal() {
    System.out.println("Animal Constructor called");
  }

  void eat() {
    System.out.println("animal eats");
  }

  abstract void walk();
}

class Horse extends Animal {
  Horse() {
    System.out.println("Horse Constructor called");
  }

  void changeColor() {
    color = "dark brown";
  }

  void walk() {
    System.out.println("walks on 4 leg");
  }
}

class Mustang extends Horse {
  Mustang() {
    System.out.println("Mustang Constructor called");
  }
}

class Chicken extends Animal {
  Chicken() {
    System.out.println("Chicken Constructor called");
  }

  void changeColor() {
    color = "yellow";
  }

  void walk() {
    System.out.println("walks on 2 leg");
  }
}