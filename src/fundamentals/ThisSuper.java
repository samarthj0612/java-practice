// Every class in Java is a subclass of the Object class.
// The Object class is the root of the class hierarchy.
// Every class has Object as a superclass.
// All objects, including arrays, implement the methods of this class.
// class A extends Object {

class A{
  public A(){
    // super(); // The call to the superclass constructor is implicit if not specified.
    System.out.println("A's constructor");
  }

  public A(int x){
    // super();
    System.out.println("A's constructor with parameter: " + x);
  }
}

class B extends A{
  public B(){
    // super();
    System.out.println("B's constructor");
  }

  public B(int x){
    // super(x); // The call to the superclass constructor with parameter is implicit if not specified.
    System.out.println("B's constructor with parameter: " + x);
  }

  public B(String str){
    // super();
    this(); // Calling the default constructor of the same class
    // this(23); // Calling the constructor with an integer parameter of the same class

    // Constructor cannot have more than one explicit constructor call

    System.out.println("B's constructor with parameter: " + str);
  }
}

public class ThisSuper {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    System.out.println("This and Super\n");

    A a1 = new A();
    System.out.println();
    B b1 = new B();
    System.out.println();
    B b2 = new B(10);
    System.out.println();
    B b3 = new B("Samarth");
  }
}
