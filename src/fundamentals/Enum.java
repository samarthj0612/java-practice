package fundamentals;

// Enums are also a type of class in Java, and they can have fields, methods, and constructors.
// However, they cannot be instantiated using the new keyword. Instead, they are instantiated automatically when the enum is loaded.
// Enums are a special data type that enables for a variable to be a set of predefined constants.
// The variable must be equal to one of the values that have been predefined for it.
// Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week.

enum Day {
  SUNDAY,
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY
}

enum Status {
  PENDING,
  IN_PROGRESS,
  COMPLETED
}

enum Laptop {
  DELL,
  HP,
  LENOVO(1500), // We can also define a constructor for the enum to associate a price with each laptop brand.
  ASUS,
  ACER;

  private int price;

  Laptop(){
    this.price = 0;
  }
  
  Laptop(int price){
    this.price = price;
  }

  // We can also have getter methods to retrieve the price of the laptop brand
  public int getPrice() {
    return this.price;
  }
}

public class Enum {
  public static void main(String[] args) {
    System.out.println("Enum\n");

    Day currentDay = Day.THURSDAY;
    System.out.println("Current Day: " + currentDay);
    System.out.println("Ordinal of current day: " + currentDay.ordinal());

    System.out.println();

    System.out.println("Days of the week:");
    for (Day day : Day.values()) {
      System.out.println(day + " - " + day.ordinal());
    }

    System.out.println();

    Status currentStatus = Status.IN_PROGRESS;

    switch (currentStatus) {
      case PENDING:
        System.out.println("The task is pending.");
        break;
      case IN_PROGRESS:
        System.out.println("The task is in progress.");
        break;
      case COMPLETED:
        System.out.println("The task is completed.");
        break;
      default:
        System.out.println("Unknown status.");
    }

    System.out.println();

    for(Laptop laptop : Laptop.values()) {
      System.out.println("Laptop brand: " + laptop + ", Price: " + laptop.getPrice());
    }
  }
}
