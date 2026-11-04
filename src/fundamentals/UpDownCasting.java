package fundamentals;

// Upcasting and Downcasting in Java
// Upcasting: Converting a subclass reference to a superclass reference.
// Downcasting: Converting a superclass reference back to a subclass reference.

class UpDownCasting1{
  void show1(){
    System.out.println("In class UpDownCasting1");
  }
}

class UpDownCasting2 extends UpDownCasting1{
  void show2(){
    System.out.println("In class UpDownCasting2");
  }
}


public class UpDownCasting {
  public static void main(String[] args) {
    System.out.println("Upcasting and Downcasting in Java");

    UpDownCasting1 a1 = new UpDownCasting1();
    a1.show1();

    UpDownCasting2 b1 = new UpDownCasting2();
    b1.show1(); // Inherited method from class UpDownCasting1
    b1.show2(); // Method from class UpDownCasting2

    UpDownCasting1 a2 = new UpDownCasting2(); // Upcasting
    // UpDownCasting1 a2 = (UpDownCasting1) new UpDownCasting2(); // Optional
    a2.show1();
    // a2.show2(); // Compile-time error: show2() is not defined in class UpDownCasting1
    
    UpDownCasting2 b2 = (UpDownCasting2) a2; // Downcasting
    b2.show1(); // Inherited method from class UpDownCasting1
    b2.show2(); // Method from class UpDownCasting2
  }
}
