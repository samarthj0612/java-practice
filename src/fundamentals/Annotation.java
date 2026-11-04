package fundamentals;

// This annotation indicates that the class is deprecated and should not be used in new code.
// It serves as a warning to developers that the class may be removed in future versions.

/**
 * @deprecated Use {@link Annotation2} instead because this old class lacks thread safety.
 * @see Annotation2
 */
@Deprecated()
class Annotation1 {
  void display() {
    System.out.println("Displaying from Annotation1\n");
  }
}

class Annotation2 {
  void display() {
    System.out.println("Displaying from Annotation2\n");
  }
}

class Annotation3 extends Annotation2 {
  // The @Override annotation indicates that the method is intended to override a method in the superclass.
  @Override 
  void display() {
    System.out.println("Displaying from Annotation3\n");
  }

  @Deprecated 
  void playSound() {
    System.out.println("Playing sound from Annotation3\n");
  }

  void playMusic() {
    System.out.println("Playing music from Annotation3\n");
  }
}

@SuppressWarnings("deprecation") // Suppresses warnings related to the use of deprecated methods or classes in this class.
public class Annotation {
  public static void main(String[] args) {
    System.out.println("Annotation\n");

    // The @SuppressWarnings annotation is used to suppress specific compiler warnings for the annotated element.
    @SuppressWarnings("unused")
    int num;

    Annotation1 annotation1 = new Annotation1(); // Creating an instance of the deprecated class Annotation1
    annotation1.display();

    Annotation2 annotation2 = new Annotation2();
    annotation2.display();

    Annotation3 annotation3 = new Annotation3(); // Creating an instance of the class Annotation3
    annotation3.display();
    annotation3.playSound(); // Calling the deprecated method playSound() from Annotation3
    annotation3.playMusic();
  }
}
