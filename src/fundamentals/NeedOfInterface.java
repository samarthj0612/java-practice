package fundamentals;

// Interfaces are used to achieve abstraction and multiple inheritance in Java.
// They allow you to define a contract that classes can implement, ensuring that they provide specific behavior.
// This is particularly useful when you want to define a common set of methods that different classes should implement, regardless of their class hierarchy.

// Example: Let's say we have two classes, Dog and Cat, which are not related by inheritance but both can make sounds.
// We can define an interface called AnimalSound with a method makeSound(), and both Dog and Cat can implement this interface.

interface NeedOfInterfac4{
  void print();
}

class NeedOfInterface1 implements NeedOfInterfac4{
  public void print(){
    System.out.println("Printing from NeedOfInterface1");
  }
}

class NeedOfInterface2 implements NeedOfInterfac4{
  public void print(){
    System.out.println("Printing from NeedOfInterface2");
  }
}

class NeedOfInterfac3{
  // But if we want to print from NeedOfInterface1, we can use the interface type.
  void print(NeedOfInterface1 obj1){
    obj1.print();
  }

  // But if we want to print from NeedOfInterface2 as well, we'll need to create a separate method for that, which can lead to code duplication and maintenance issues.
  void print(NeedOfInterface2 obj2){
    obj2.print();
  }

  // To avoid this, we can use an interface as a common type for both NeedOfInterface1 and NeedOfInterface2.
  void print(NeedOfInterfac4 obj){
    obj.print();
  }
}

public class NeedOfInterface {
  public static void main(String[] args) {
    System.out.println("Need of Interface\n");

    NeedOfInterface1 obj1 = new NeedOfInterface1();
    obj1.print();

    NeedOfInterface2 obj2 = new NeedOfInterface2();
    obj2.print();

    NeedOfInterfac3 obj3 = new NeedOfInterfac3();
    obj3.print(obj1);
    obj3.print(obj2);

    NeedOfInterface1 obj4 = new NeedOfInterface1();
    NeedOfInterface2 obj5 = new NeedOfInterface2();
    obj3.print(obj4);
    obj3.print(obj5);
  }
}
