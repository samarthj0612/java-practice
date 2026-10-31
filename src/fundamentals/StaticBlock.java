class StaticBlock1{
  // Static Block
  // Static block is executed only once when the class is loaded into memory
  // It is used to initialize static variables or perform any static initialization
  // It is executed before the main method and before any object of the class is created
  // It is executed only once irrespective of the number of objects created
  static {
    System.out.println("Inside Static Block");
  }

  StaticBlock1(){
    System.out.println("Inside Constructor Block");
  }

  void printDetails(){
    System.out.println("Inside Print Details Method");
  }
}

public class StaticBlock {
  public static void main(String[] args) {
    System.out.println("Static Block");

    StaticBlock1 sb1 = new StaticBlock1();
    StaticBlock1 sb2 = new StaticBlock1();

    sb1.printDetails();
    sb2.printDetails();

    // Even static blocks only executed once when the class is loaded into memory
    // Means object creation is not required to execute static block, it is executed only once when the class is loaded into memory
    // But how to execute static block without creating object of the class? We can do this by using Class.forName() method.
    // It loads the class into memory and executes the static block.
    try {
      Class.forName("StaticBlock1");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

  }
}
