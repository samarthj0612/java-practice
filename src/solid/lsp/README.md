### Liskov's Substitution Principle

According to this principle, "derived or child classes must be able to replace their base or parent classes". This ensures that any subclass can be used in place of its parent class without causing unexpected behavior in the program.

One of the classic examples of this principle is a rectangle having four sides. A rectangle's height can be any value and width can be any value. A square is a rectangle with equal width and height. So we can say that we can extend the properties of the rectangle class into square class.

- Rectangle Class: This is the base class that has properties for width and height. It has methods for calculating the area and for setting width and height.
- Square Class: This class inherits from Rectangle but overrides the setWidth and setHeight methods to ensure that changing one dimension affects the other, maintaining the property that all sides are equal.