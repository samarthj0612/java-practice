package fundamentals;

// An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
// The methods in an interface are by default public and abstract.
// The fields in an interface are by default public static final.
// Interfaces cannot contain instance fields or constructors. They are used to achieve abstraction and multiple inheritance in Java.
// Field are [ublic static final by default because interface doesn't use heap memory, so they are stored in the method area. The method area is shared among all instances of a class, so the fields in an interface are shared among all classes that implement the interface.
interface Interface1{
  String name = "Samarth Jain"; // public static final by default
  int age = 20; // public static final by default

  void show(); // public and abstract by default
  void display(); // public and abstract by default
}

class Interface2 implements Interface1 {
  public void show() {
    System.out.println("Showing from Interface2");
  }

  public void display() {
    System.out.println("Displaying from Interface2");
  }
}

public class Interface {
  public static void main(String[] args) {
    System.out.println("Interface");

    // Interface1 interface1 = new Interface1(); // This won't work because Interface1 is an interface and cannot be instantiated directly.
    Interface1 interface1; // This is valid because we are declaring a reference of type Interface1, but not instantiating it.
    System.out.println("Name: " + Interface1.name); // This is valid because name is a static field in Interface1, so we can access it using the interface name.
    System.out.println("Age: " + Interface1.age);
    // Interface1.show(); // This won't work because show() is an instance method and cannot be called using the interface name. We need to create an instance of a class that implements the interface to call the method.

    interface1 = new Interface2(); // This is valid because Interface2 implements Interface1, so we can create an instance of Interface2 and assign it to a reference of type Interface1.
    interface1.show();
    interface1.display();

    System.out.println(Interface2.name); // This is valid because name is a static field in Interface1, and Interface2 implements Interface1, so we can access it using the class name of Interface2.
    System.out.println(Interface2.age); // This is valid because age is a static field in Interface1, and Interface2 implements Interface1, so we can access it using the class name of Interface2.
  }
}
