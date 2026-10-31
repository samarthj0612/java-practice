class Hello {
  public static void main(String args[]){
    System.out.println("Hello, World!");

    // DATA TYPES

    byte num11 = 127;
    // byte num12 = 128;
    short num21 = 128;
    short num22 = 32767;
    // short num23 = 32768;
    int num31 = 32768;
    int num32 = 2147483647;
    // int num33 = 2147483648;
    long num41 = 2147483648l;
    long num42 = 9223372036854775807l;
    // long num43 = 9223372036854775808l;

    System.out.println("byte: " + num11);
    System.out.println("short: " + num21 + " | " + num22);
    System.out.println("int: " + num31 + " | " + num32);
    System.out.println("long: " + num41 + " | " + num42);

    // LITERALS

    // Instead of base 10 direct values,
    // we can use base two values as well
    int base2 = 0b101;
    System.out.println("base2: " + base2);

    // We can also use base 16 (hexadecimal) values
    int base16 = 0xFF;
    System.out.println("base16: " + base16);

    // We can also use underscores to make numbers more readable
    int zeroes = 10_00_00_000;
    System.out.println("zeroes: " + zeroes);

    // We can also use scientific notation for large numbers
    double bigNum = 12e10;
    System.out.println("bigNum: " + bigNum);

    // We can also use character literals
    char a = 'a';
    System.out.println("a: " + a);
    a++;
    System.out.println("a: " + a);

    int b = 'b';
    System.out.println("b: " + b);
    b++;
    System.out.println("b: " + b);

    // CONVERSION
    int num51 = 257;
    byte num52 = 68;

    System.out.println("num51 int: " + num51);
    System.out.println("num52 byte: " + num52);
    
    int temp = num51;
    num51 = num52;
    num52 = (byte) temp;
    System.out.println("After conversion");
    System.out.println("num51 int: " + num51);
    System.out.println("num52 byte: " + num52);

    byte a1 = 10;
    byte a2 = 30;
    int result = a1 * a2;
    System.out.println(result);
  }
}