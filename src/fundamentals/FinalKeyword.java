// Final Keyword with class

class FinalKeyword1 {
  void show(){
    System.out.println("Show method in FinalKeyword1");
  }

  final void display(){
    System.out.println("Display method in FinalKeyword1");
  }
}

final class FinalKeyword2 extends FinalKeyword1 {
  void show(){
    System.out.println("Show method in FinalKeyword2");
  }
  
  // This will cause a compile-time error because the display method in FinalKeyword1 is final and cannot be overridden.
  // void display(){
  //   System.out.println("Display method in FinalKeyword2");
  // }
}

// The following class declaration will cause a compile-time error because FinalKeyword1 is declared as final and cannot be subclassed.
// class FinalKeyword3 extends FinalKeyword2 {
//   void show(){
//     System.out.println("Show method in FinalKeyword2");
//   }
  
//   void display(){
//     System.out.println("Display method in FinalKeyword2");
//   }
// }

public class FinalKeyword {
  public static void main(String[] args) {
    System.out.println("Final Keyword");

    // Final Keyword with variables

    int num1 = 10;
    num1 = 6; // This is valid because num is not declared as final
    System.out.println("Num1: " + num1); // Output: Num1: 6

    final int num2 = 20;
    // num2 = 30; // This line will cause a compile-time error because num2 is declared as final and cannot be reassigned.
    System.out.println("Num2: " + num2); // Output: Num2: 20

    // So we can use final keyword with
    // Class to void ineritance
    // Method to prevent overriding
    // Variable to prevent reassignment
  }
}
