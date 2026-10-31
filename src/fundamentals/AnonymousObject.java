class AnonymousObject1{
  AnonymousObject1(){
    System.out.println("Object created");
  }

  void print(){
    System.out.println("Inside print method");
  }
}

public class AnonymousObject {
  public static void main(String[] args) {
    new AnonymousObject1(); // Anonymous object is created and constructor is called
    new AnonymousObject1().print(); // Anonymous object is created and print method is called

    // Anonymous object is created and print method is called
    // But we cannot call print method again because the object is not referenced

    // So here this type of object are called as object with no reference or anonymous object
    // Because we cannot reuse them again because the object is not referenced
  }
}
