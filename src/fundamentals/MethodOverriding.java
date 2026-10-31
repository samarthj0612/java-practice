// Method Overriding in Java
// Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.

class Animal {
  public void makeSound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  // @Override // This annotation indicates that the method is overriding a method from the superclass
  // The @Override annotation is optional but recommended as it helps catch errors at compile time if the method signature does not match any method in the superclass.
  public void makeSound() {
    System.out.println("Dog barks");
  }
}

public class MethodOverriding {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Dog dog = new Dog();

    animal.makeSound(); // Output: Animal makes a sound
    dog.makeSound();    // Output: Dog barks
  }
}
