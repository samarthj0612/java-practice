// Constructor in Java is a block of code similar to a method that is called when an instance of an object is created. It is used to initialize the object. It can be used to set initial values for object attributes. A constructor has the same name as the class and does not have a return type.

class Human {
  private int age;
  private String name;
  private String email;

  // Default constructor or no-argument constructor or Normal constructor
  Human(){
    this.age = 24;
    this.name = "Samarth";
    this.email = "samarth@example.com";
  }
  
  // Parameterized constructor or constructor with arguments or constructor with parameters
  Human(int age){
    this.age = age;
    this.name = "Samarth";
    this.email = "samarth@example.com";
  }
  
  Human(String name){
    this.age = 24;
    this.name = name;
    this.email = "samarth@example.com";
  }
  
  // Not allowed because of ambiguity
  // Human(String email){
  //   this.age = 24;
  //   this.name = "Samarth";
  //   this.email = email;
  // }
  
  Human(int age, String name){
    this.age = age;
    this.name = name;
    this.email = "samarth@example.com";
  }
  Human(int age, String name, String email){
    this.age = age;
    this.name = name;
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }
}

public class Constructor {
  public static void main(String[] args) {
    System.out.println("Constructor");

    Human h1 = new Human();
    System.out.println("Age: " + h1.getAge() + " | Name: " + h1.getName() + " | Email: " + h1.getEmail());

    Human h2 = new Human(30);
    System.out.println("Age: " + h2.getAge() + " | Name: " + h2.getName() + " | Email: " + h2.getEmail());

    Human h3 = new Human("John");
    System.out.println("Age: " + h3.getAge() + " | Name: " + h3.getName() + " | Email: " + h3.getEmail());

    Human h4 = new Human(30, "John");
    System.out.println("Age: " + h4.getAge() + " | Name: " + h4.getName() + " | Email: " + h4.getEmail());

    Human h5 = new Human(30, "John", "john@example.com");
    System.out.println("Age: " + h5.getAge() + " | Name: " + h5.getName() + " | Email: " + h5.getEmail());
  }
}
