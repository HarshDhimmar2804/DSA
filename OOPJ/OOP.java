public class OOP {
  public static void main(String[] args) {
    Pen p1 = new Pen();// create a pen object called p1
    p1.setColor("Blue");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());
    // p1.setColor("Yellow");
    p1.setColor("Yellow");
    System.out.println(p1.getColor());

    // BankAccount b1 = new BankAccount();
    // b1.username = "harshdhimmar";
    // b1.setPassword("abcdefg");
  }
}

class Pen {
  private String color;
  private int tip;

  String getColor() {
    return this.color;
  }

  int getTip() {
    return this.tip;
  }

  void setColor(String newColor) {
    this.color = newColor;
  }

  void setTip(int tip) {
    this.tip = tip;
  }
}

// //Access specifier example
// class BankAccount {
// public String username;
// private String password;

// public void setPassword(String pwd) {
// password = pwd;
// }
// }

// class Student {
// String name;
// int age;
// float percentage;

// void calcPercantage(int phy, int math, int chem) {
// percentage = (phy + math + chem) / 3;
// }
// }
