class Static1{
  String name;
  static String email;

  void logDetails(){
    System.out.println("Name: " + this.name + " | Email: " + email);
  }
  
  static void logStaticDetails(){
    // Not allowed to access non-static variable using static method
    // System.out.println("Name: " + name + " | Email: " + email);

    System.out.println("Email: " + email);
  }
  
  static void logDetailsUsingStaticMethod(Static1 obj){
    // We cannot use non static variables inside static method directly
    // But we can use them using object reference
    System.out.println("Name: " + obj.name + " | Email: " + email);
  }
}

public class Static {
  public static void main(String[] args) {
    System.out.println("Static");

    Static1 st1 = new Static1();

    st1.name = "Samarth";
    // st1.email = "samarth@example.com"; // Not recommended to access static variable using object reference, but it is allowed
    Static1.email = "samarth@example.com"; // Recommended way to access static variable using class name

    st1.logDetails();
    // st1.logStaticDetails(); // Not recommended to access static method using object reference, but it is allowed
    Static1.logStaticDetails(); // Recommended way to access static method using class name

    // Static1.name = "Samarth"; // Not allowed because name is not static
    Static1.email = "samarth@example.com";
    // Static1.logDetails(); // Not allowed to access non-static method using static reference
    Static1.logStaticDetails();
    Static1.logDetailsUsingStaticMethod(st1);
  }
}
