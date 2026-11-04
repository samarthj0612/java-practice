package fundamentals;

// Anonymous inner class that extends the abstract class and provides implementations for the abstract methods
// An anonymous inner class is a class that is defined and instantiated in a single expression.
// It does not have a name and is typically used to provide a concrete implementation of an abstract class or interface on the fly.

class AnonymousInnerClass1{
  void show() {
    System.out.println("Inside AnonymousInnerClass1");
  }
}

class AnonymousInnerClass2 extends AnonymousInnerClass1{
  void show() {
    System.out.println("Inside AnonymousInnerClass2");
  }
}

public class AnonymousInnerClass {
  public static void main(String[] args) {
    System.out.println("Anonymous Inner Class\n");

    AnonymousInnerClass1 anonymous1 = new AnonymousInnerClass1();
    anonymous1.show();
    
    AnonymousInnerClass1 anonymous2 = new AnonymousInnerClass2();
    anonymous2.show();

    // Creating an anonymous inner class that extends the class
    AnonymousInnerClass1 anonymous3 = new AnonymousInnerClass1() {
      void show() {
        System.out.println("Inside Anonymous Inner Class");
      }

      // We cannot call this method using the reference of AnonymousInnerClass1 because it is not defined in the parent class. It is only defined in the anonymous inner class.
      // void display() {
      //   System.out.println("Display method in Anonymous Inner Class");
      // }
    };
    anonymous3.show();
    // anonymous3.display(); // This will cause a compilation error because the reference type is AnonymousInnerClass1, which does not have a display() method.
  }
}
