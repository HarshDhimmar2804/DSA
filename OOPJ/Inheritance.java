package OOPS;

public class Inheritance {
  public static void main(String[] args) {

    // Multi-level Inheritance
    // Dog doggy = new Dog();
    // doggy.eat();
    // doggy.legs = 4;
    // System.out.println(doggy.legs);

    // Single Inheritance
    // Fish shark = new Fish();
    // shark.eat();
  }
}

// base class
class Animal {
  String color;

  void eat() {
    System.out.println("eats");
  }

  void breathe() {
    System.out.println("breathes");
  }
}

class Mammel extends Animal {
  void walk() {
    System.out.println("walks");
  }
}

class Fish extends Animal {
  void swim() {
    System.out.println("swim");
  }
}

class Bird extends Animal{
  void fly(){
    System.out.println("fly");
  }
}

// class Dog extends Mammel {
// String breed;
// }

// // derived class /sub class
// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.println("Swims in water");
// }
// }