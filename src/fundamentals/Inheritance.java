// Inheritance in Java is a mechanism where one class acquires the properties (fields) and behaviors (methods) of another class.
// The class which inherits the properties of another is known as a subclass (or derived class, child class),
// And the class whose properties are inherited is known as a superclass (or base class, parent class).

// Inheritance provides the reusability of code and establishes a relationship between classes.
// It allows for hierarchical classification.
class Calculator{
  int add(int a, int b){
    return a + b;
  }

  int subtract(int a, int b){
    return a - b;
  }
}

// AdvanceCalculator is a subclass of Calculator
// Here single inheritance is demonstrated, where AdvanceCalculator inherits from Calculator.
class AdvanceCalculator extends Calculator{
  int multiply(int a, int b){
    return a * b;
  }

  int divide(int a, int b){
    if(b == 0){
      throw new ArithmeticException("Division by zero is not allowed");
    }
    return a / b;
  }
}

// ScientificCalculator is a subclass of AdvanceCalculator
// Here multilevel inheritance are demonstrated, where ScientificCalculator inherits from AdvanceCalculator, which in turn inherits from Calculator.
class ScientificCalculator extends AdvanceCalculator{
  double power(double a, double b){
    return Math.pow(a, b);
  }

  double squareRoot(double a){
    return Math.sqrt(a);
  }
}

public class Inheritance {
  public static void main(String[] args) {
    System.out.println("Inheritance");

    Calculator calc1 = new Calculator();
    System.out.println("Addition: " + calc1.add(10, 5));
    System.out.println("Subtraction: " + calc1.subtract(10, 5));
    
    AdvanceCalculator calc2 = new AdvanceCalculator();
    System.out.println("Multiplication: " + calc2.multiply(10, 5));
    System.out.println("Division: " + calc2.divide(10, 5));
    System.out.println("Addition using AdvanceCalculator: " + calc2.add(10, 5)); // Inherited method
    
    ScientificCalculator calc3 = new ScientificCalculator();
    System.out.println("Power: " + calc3.power(2, 3));
    System.out.println("Square Root: " + calc3.squareRoot(16));
    System.out.println("Addition using ScientificCalculator: " + calc3.add(10, 5)); // Inherited method
    System.out.println("Multiplication using ScientificCalculator: " + calc3.multiply(10, 5));


  }
}
