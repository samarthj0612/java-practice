public class StringPractice {
  public static void main(String[] args) {
    String str1 = "Samarth"; // It creates a object in heap memory and store reference in the stack for str1 variable
    String str2 = "Samarth"; // It will not create a new object in heap memory as the value is already present in the heap memory or String Constant Pool (SCP). It will just store the reference in the stack for str2 variable

    str2 = "Jain"; // It will create a new object in heap memory and store reference in the stack for str1 variable. The previous object will be garbage collected as there is no reference to it now.

    System.out.println(str1 + " " + str2);

    String initial = str1.charAt(0) + "" + str2.charAt(0);
    System.out.println("Initials: " + initial);

    // Conclusion
    // 1. String is immutable in Java. Once created, it cannot be changed.
    // 2. String is a class in Java. It is not a primitive data type
    // 3. String is stored in heap memory and reference is stored in stack memory
    // 4. String is a sequence of characters

    System.out.println();

    // String buffer

    StringBuffer sb1 = new StringBuffer("Samarth");
    StringBuffer sb2 = new StringBuffer("Samarth"); // It will create a new object in heap memory and store reference in the stack for sb2 variable
    System.out.println(sb1 + " " + sb2);

    sb2 = new StringBuffer("Jain"); // It will create a new object in heap memory and store reference in the stack for sb2 variable. The previous object will be garbage collected as there is no reference to it now.
    System.out.println(sb1 + " " + sb2); 

    // StringBuffer is a mutable class in Java. It can be changed after creation.
    StringBuffer sb3 = new StringBuffer("Semarth");
    sb3.deleteCharAt(1);
    sb3.insert(1, 'a');
    sb3.append(" Jain");
    System.out.println(sb3);

    // When you initialize a StringBuffer with a string, Java sets its initial capacity to:
    // Capacity = String length + 16

    // If a StringBuffer needs more space, Java typically increases its capacity using this formula:
    // New capacity = (Old capacity x 2) + 2

    StringBuffer sb4 = new StringBuffer("Samarth Jain");
    System.out.println("Capacity: " + sb3.capacity());
    System.out.println("Capacity: " + sb4.capacity());

    StringBuffer sb5 = new StringBuffer("Samarth");
    System.out.println(sb5 + " | Capacity: " + sb5.capacity() + " | Length: " + sb5.length());
    sb5.setLength(30);
    System.out.println(sb5 + " | Capacity: " + sb5.capacity() + " | Length: " + sb5.length());
    sb5.ensureCapacity(100);
    System.out.println(sb5 + " | Capacity: " + sb5.capacity() + " | Length: " + sb5.length());

    // We've string builder as well and the only difference is that-
    // String buffer is thread safe and string builder is not

    // String Builder
    System.out.println("\nString Builder:");

    StringBuilder sbd1 = new StringBuilder("Samarth");
    System.out.println(sbd1 + " | Capacity: " + sbd1.capacity() + " | Length: " + sbd1.length());

    StringBuffer sbd2 = new StringBuffer("Samarth");
    StringBuffer sbd3 = new StringBuffer("Samarth"); // It will create a new object in heap memory and store reference in the stack for sbd3 variable
    System.out.println(sbd2 + " " + sbd3);

    sbd3 = new StringBuffer("Jain"); // It will create a new object in heap memory and store reference in the stack for sbd3 variable. The previous object will be garbage collected as there is no reference to it now.
    System.out.println(sbd2 + " " + sbd3); 

    // StringBuffer is a mutable class in Java. It can be changed after creation.
    StringBuffer sbd4 = new StringBuffer("Semarth");
    sb3.deleteCharAt(1);
    sb3.insert(1, 'a');
    sb3.append(" Jain");
    System.out.println(sbd4);
  }
}
