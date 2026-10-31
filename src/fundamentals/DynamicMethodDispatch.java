// Dynamic Method Dispatch is a mechanism by which a call to an overridden method is resolved at runtime rather than compile-time.
// It is also known as runtime polymorphism. In Java, this is achieved through method overriding, where a subclass provides a specific implementation of a method that is already defined in its superclass.
// The reference type determines what you can access, but the object type determines which overridden method runs

class A{
  void display(){
    System.out.println("Class A");
  }

  void print(){
    System.out.println("Print method in Class A");
  }
}

class B extends A{
  void display(){
    System.out.println("Class B");
  }

  void show(){
    System.out.println("Show method in Class B");
  }
}

class C extends A{
  void display(){
    System.out.println("Class C");
  }

  void print(){
    System.out.println("Print method in Class C");
  }
}

class D extends A{
  void display(){
    System.out.println("Class D");
  }
}

public class DynamicMethodDispatch {
  public static void main(String[] args) {
    System.out.println("Dynamic Method Dispatch Example");

    A a1 = new A();
    a1.display(); // Output: Class A

    // Re-assigning the same parent reference to a different child object
    a1 = new B();
    a1.display(); // Output: Class B

    // Upcasting: Parent reference pointing to a Child object
    A a2 = new B();
    // Dynamic Method Dispatch happens here
    a2.display(); // Output: Class B
    // a2.show(); // This line will cause a compile-time error because the reference type A does not have a method named show().

    A a3 = new C();
    a3.display(); // Output: Class C
    a3.print(); // Output: Print method in Class C

    A a4 = new D();
    a4.display(); // Output: Class D

    // Compile Time: The Java compiler checks the reference type (A).
    // It verifies that the display() method exists in the A class. If it does, the code compiles successfully.

    // Runtime: The Java Virtual Machine (JVM) looks at the actual object in heap memory (B or C).
    // Using a mechanism called Virtual Method Invocation, the JVM skips the parent's method and directly triggers the overridden version inside the child object.
  }
}
