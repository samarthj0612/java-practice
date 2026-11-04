package fundamentals;

// This program demonstrates the concept of multiple interfaces in Java.
// A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.
// However, if two interfaces have methods with the same name but different return types, it creates a conflict if any interface implements those two interfaces together that cannot be resolved, leading to a compilation error.

// Class - extends - Class
// Class - implements - Interface
// Interface - extends - Interface

interface MultipleInterface1 {
  void show();
}

interface MultipleInterface2 {
  void display();
  // String show();   // This might cause a compilation error because the method signature of show() in MultipleInterface1 and MultipleInterface2 are different.
                      // The return type of show() in MultipleInterface1 is void, while the return type of show() in MultipleInterface2 is String.
                      // In Java, when a class implements multiple interfaces, it must provide implementations for all the methods declared in those interfaces.
                      // If two interfaces have methods with the same name but different return types, it creates a conflict that cannot be resolved, leading to a compilation error.
      
}

interface MultipleInterface3 extends MultipleInterface1, MultipleInterface2 {
  void playMusic();

  // int display(); // This too might cause a compilation error because the method signature of display() in MultipleInterface2 and MultipleInterface3 are different.
}

class MultipleInterfaceClass1 implements MultipleInterface1 {
  public void show() {
    System.out.println("Showing from MultipleInterfaceClass1");
  }
}

class MultipleInterfaceClass2 implements MultipleInterface2 {
  public void display() {
    System.out.println("Displaying from MultipleInterfaceClass2");
  }
}

class MultipleInterfaceClass3 implements MultipleInterface3 {
  public void show() {
    System.out.println("Showing from MultipleInterfaceClass3");
  }

  public void display() {
    System.out.println("Displaying from MultipleInterfaceClass3");
  }

  public void playMusic() {
    System.out.println("Playing music from MultipleInterfaceClass3");
  }
}

public class MultipleInterface {
  public static void main(String[] args) {
    System.out.println("Multiple Interface\n");

    MultipleInterfaceClass1 class1 = new MultipleInterfaceClass1();
    class1.show();
    // class1.display(); // This will cause a compilation error because MultipleInterfaceClass1 does not implement MultipleInterface2, and therefore does not have a display() method.

    MultipleInterfaceClass2 class2 = new MultipleInterfaceClass2();
    class2.display();
    // class2.show(); // This will cause a compilation error because MultipleInterfaceClass2 does not implement MultipleInterface1, and therefore does not have a show() method.

    MultipleInterfaceClass3 class3 = new MultipleInterfaceClass3();
    class3.show();
    class3.display(); // This will work because MultipleInterfaceClass3 implements both MultipleInterface1 and MultipleInterface2, and therefore has both show() and display() methods.
    class3.playMusic();
  }
}
