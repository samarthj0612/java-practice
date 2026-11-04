package fundamentals;

// Abstract class cannot be instantiated directly, but it can be subclassed.
// An abstract class can have abstract methods (methods without a body) that must be implemented by subclasses, as well as concrete methods (methods with a body) that can be inherited by subclasses.
// Concrete classes are classes that can be instantiated directly and must provide implementations for all abstract methods inherited from their abstract superclass.

abstract class Car{
    abstract public void start();

    abstract public void drive();

    public void stop() {
        System.out.println("Car is stopping");
    }
}

// Sedan class that extends Car and provides an implementation for the start() method
// In this case, it leaves the drive() method abstract and that's why it needs to be an abstract class itself.
// But because it's an abstract class, it can also have abstract methods.
abstract class Sedan extends Car {
    abstract public void brake();

    public void start() {
        System.out.println("Sedan is starting");
    }
}

// Concrete class that extends Sedan and provides implementations for the abstract methods start(), drive(), and brake().
class Hatchback extends Sedan {
    public void drive() {
        System.out.println("Hatchback is driving");
    }

    public void brake() {
        System.out.println("Hatchback is braking");
    }
}

class SUV extends Car {
    public void start() {
        System.out.println("SUV is starting");
    }

    public void drive() {
        System.out.println("SUV is driving");
    }
}

public class Abstract {
    public static void main(String[] args) {
        System.out.println("Abstract");

        // Cannot instantiate abstract class
        // Car car = new Car();
        // Car sedan = Sedan();
        Car hatchback = new Hatchback();
        hatchback.start();
        hatchback.drive();

        // This won't work because the reference type is Car, which doesn't have a brake() method.
        // To call brake(), we need to use a reference of type Sedan or Hatchback.
        // hatchback.brake();

        hatchback.stop();

        // This won't work because Sedan & Car both are abstract classes and cannot be instantiated directly.
        // Sedan sedan = Car();
        // Sedan sedan = new Sedan();
        Sedan sedan = new Hatchback();
        sedan.start();
        sedan.drive();
        sedan.brake();
        sedan.stop();

        Car suv = new SUV();
        suv.start();
        suv.drive();
        suv.stop();

        SUV suv2 = new SUV();
        suv2.start();
        suv2.drive();
        suv2.stop();

        System.out.println("All cars are functioning correctly.");
    }
}