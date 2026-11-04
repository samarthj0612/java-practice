package fundamentals;

// Every class in Java is a subclass of the Object class.
// The Object class is the root of the class hierarchy.
// Every class has Object as a superclass.
// All objects, including arrays, implement the methods of this class.
// class ThisSuper1 extends Object {

class ThisSuper1{
  public ThisSuper1(){
    // super(); // The call to the superclass constructor is implicit if not specified.
    System.out.println("ThisSuper1's constructor");
  }

  public ThisSuper1(int x){
    // super();
    System.out.println("ThisSuper1's constructor with parameter: " + x);
  }
}

class ThisSuper2 extends ThisSuper1{
  public ThisSuper2(){
    // super();
    System.out.println("ThisSuper2's constructor");
  }

  public ThisSuper2(int x){
    // super(x); // The call to the superclass constructor with parameter is implicit if not specified.
    System.out.println("ThisSuper2's constructor with parameter: " + x);
  }

  public ThisSuper2(String str){
    // super();
    this(); // Calling the default constructor of the same class
    // this(23); // Calling the constructor with an integer parameter of the same class

    // Constructor cannot have more than one explicit constructor call

    System.out.println("ThisSuper2's constructor with parameter: " + str);
  }
}

public class ThisSuper {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    System.out.println("This and Super\n");

    ThisSuper1 a1 = new ThisSuper1();
    System.out.println();
    ThisSuper2 b1 = new ThisSuper2();
    System.out.println();
    ThisSuper2 b2 = new ThisSuper2(10);
    System.out.println();
    ThisSuper2 b3 = new ThisSuper2("Samarth");
  }
}
