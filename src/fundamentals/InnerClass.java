package fundamentals;

// Inner classes are classes that are defined inside another class.
// They can access all the members of the outer class, including private members.

class InnerClass1{
  private int number = 0;

  public InnerClass1(int number) {
    this.number = number;
  }

  void display() {
    System.out.println("Displaying from InnerClass1");
    System.out.println("Number from InnerClass1: " + number);
  }

  class InnerClass2{
    void display() {
      System.out.println("Displaying from InnerClass2");
      System.out.println("Number from InnerClass2: " + number);
    }
  }

  static class InnerClass3{
    void display() {
      System.out.println("Displaying from InnerClass3");
    // Cannot access non-static members of the outer class directly
    // System.out.println("Number from InnerClass3: " + number); // This will cause a compilation error
    }
  }
}

public class InnerClass {
  public static void main(String[] args) {
    System.out.println("Inner Class");

    InnerClass1 inner1 = new InnerClass1(6);
    inner1.display();

    InnerClass1.InnerClass2 inner21 = inner1.new InnerClass2();
    inner21.display();

    InnerClass1.InnerClass2 inner22 = new InnerClass1(8).new InnerClass2();
    inner22.display();

    InnerClass1.InnerClass3 inner3 = new InnerClass1.InnerClass3();
    inner3.display();
  }
}
