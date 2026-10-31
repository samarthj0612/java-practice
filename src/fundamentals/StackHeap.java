public class StackHeap {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    // Local variable are getting stored in stack
    // While the objects/instances of a class gets stored in heap
    // Also instance variables are stored in heap while static variables are stored in stack

    Computer obj = new Computer ();
    obj.setColor("Black");
    System.out.println("Computer color: " + obj.getColor());
  }
}
