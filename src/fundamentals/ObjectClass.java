class ObjectClass1{
  int age;
  String name;

  void display(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}

class ObjectClass2{
  int age;
  String name;

  void display(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + age;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ObjectClass2{" +
            "age=" + age +
            ", name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ObjectClass2 that = (ObjectClass2) o;

    if (age != that.age) return false;
    return name != null ? name.equals(that.name) : that.name == null;
  }
}

public class ObjectClass {
  public static void main(String[] args) {
    System.out.println("Object Class\n");

    ObjectClass1 obj11 = new ObjectClass1();
    obj11.name = "Alice";
    obj11.age = 25;
    obj11.display();

    System.out.println("HashCode of obj11: " + obj11.hashCode());
    System.out.println("String representation of obj11: " + obj11.toString());

    ObjectClass1 obj12 = new ObjectClass1();
    obj12.name = "Alice";
    obj12.age = 25;
    obj12.display();

    System.out.println("HashCode of obj12: " + obj12.hashCode());
    System.out.println("String representation of obj12: " + obj12.toString());

    System.out.println("obj11 equals obj12: " + obj11.equals(obj12)); // This will return false because equals is not overridden in ObjectClass1

    System.out.println("\n");

    ObjectClass2 obj21 = new ObjectClass2();
    obj21.name = "Samarth";
    obj21.age = 24;
    obj21.display();

    System.out.println("HashCode of obj21: " + obj21.hashCode());
    System.out.println("String representation of obj21: " + obj21.toString());

    ObjectClass2 obj22 = new ObjectClass2();
    obj22.name = "Samarth";
    obj22.age = 24;
    obj22.display();

    System.out.println("HashCode of obj22: " + obj22.hashCode());
    System.out.println("String representation of obj22: " + obj22.toString());

    System.out.println("obj21 equals obj22: " + obj21.equals(obj22)); // This will return true because equals is overridden in ObjectClass2 to compare the values of age and name.
  }
}
