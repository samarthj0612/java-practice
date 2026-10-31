// Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

class Human {
  int age;
  String name;
  static String email;
  private String contact; // private variables are only accessible within the class they are declared in

  Human(){
    this.contact = "1234567890";
    email = "samarth@example.com";
  }

  // Getter
  String getContact(){
    return this.contact;
  }
  
  // Setter
  void setContact(String str){
    this.contact = str;
  }
}

public class Encapsulation {
  public static void main(String[] args) {
    Human h1 = new Human();
    h1.age = 25;
    h1.name = "Samarth";
    System.out.println("Age: " + h1.age + " | Name: " + h1.name);
    // System.out.println(h1.email); // static variables can be accessed through class name or object reference
    System.out.println("Email: " + Human.email);

    // System.out.println("Contact: " + h1.contact); // accessing private variable directly will give an error
    System.out.println("Contact: " + h1.getContact()); // accessing private variable through getter method
    
    h1.setContact("7869157972");
    System.out.println("Contact: " + h1.getContact());
  }

}
