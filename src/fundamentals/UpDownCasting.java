// Upcasting and Downcasting in Java
// Upcasting: Converting a subclass reference to a superclass reference.
// Downcasting: Converting a superclass reference back to a subclass reference.

class A{
  void show1(){
    System.out.println("In class A");
  }
}

class B extends A{
  void show2(){
    System.out.println("In class B");
  }
}


public class UpDownCasting {
  public static void main(String[] args) {
    System.out.println("Upcasting and Downcasting in Java");

    A a1 = new A();
    a1.show1();

    B b1 = new B();
    b1.show1(); // Inherited method from class A
    b1.show2(); // Method from class B

    A a2 = new B(); // Upcasting
    // A a2 = (A) new B(); // Optional
    a2.show1();
    // a2.show2(); // Compile-time error: show2() is not defined in class A
    
    B b2 = (B) a2; // Downcasting
    b2.show1(); // Inherited method from class A
    b2.show2(); // Method from class B
  }
}
