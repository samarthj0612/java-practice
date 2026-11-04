package fundamentals;

abstract class AbstractAnonymousInnerClass1{
  void display() {
    System.out.println("Inside AbstractAnonymousInnerClass1");
  }

  abstract void show();
  abstract void playMusic();
}

class AbstractAnonymousInnerClass2 extends AbstractAnonymousInnerClass1{
  void show() {
    System.out.println("Inside AbstractAnonymousInnerClass2");
  }

  void playMusic() {
    System.out.println("Playing music from AbstractAnonymousInnerClass2");
  }
}

public class AbstractAnonymousInnerClass {
  public static void main(String[] args) {
    System.out.println("Abstract Anonymous Inner Class\n");

    AbstractAnonymousInnerClass2 abstract1 = new AbstractAnonymousInnerClass2();
    abstract1.display();
    abstract1.show();
    abstract1.playMusic();

    // AbstractAnonymousInnerClass1 abstract2 = new AbstractAnonymousInnerClass1(); // This will cause a compilation error because AbstractAnonymousInnerClass1 is an abstract class and cannot be instantiated directly.

    // AbstractAnonymousInnerClass1 abstract3 = new AbstractAnonymousInnerClass1() { // This won't work because even the abstract method show() is implement but playMusic() yet not implemented in this anonymous inner class.
    //   void show() {
    //     System.out.println("Inside Abstract Anonymous Inner Class");
    //   }
    // };

    AbstractAnonymousInnerClass1 abstract4 = new AbstractAnonymousInnerClass1() { // This is an anonymous inner class that extends the abstract class and provides implementations for the abstract methods.
      void show() {
        System.out.println("Inside Abstract Anonymous Inner Class");
      }

      void playMusic() {
        System.out.println("Playing music from Abstract Anonymous Inner Class");
      }
    };
    abstract4.display();
    abstract4.show();
    abstract4.playMusic();
  }
}
