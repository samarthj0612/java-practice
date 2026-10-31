class Practice1{
  static String name;

  Practice1(){
    name = "Samarth";
  }

  void setName(String namePara){
    name = namePara;
  }

  String getName(){
    return name;
  }
}

public class Practice {
  public static void main(String[] args) {
    System.out.println("Practice");
    
    System.out.println(args.length);
    for(int i=0; i<args.length; i++){
      System.out.println(args[i]);
    }

    Practice1 p1 = new Practice1();
    System.out.println("Name: " + p1.getName());
    System.out.println("Name: " + Practice1.name);
    
    Practice1 p2 = new Practice1();
    p1.setName("John");
    System.out.println("Name: " + p2.getName());
    System.out.println("Name: " + Practice1.name);
  }
}
