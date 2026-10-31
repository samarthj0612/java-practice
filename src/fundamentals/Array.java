class Array {
  public static void main(String[] args){
    System.out.println("Hello World, it's Array!\n");

    int[] arr = new int[5];
    arr[0] = 10;

    for(int i = 0; i < arr.length; i++){
      System.out.println("Index-" + i + ": " + arr[i]);
    }

    System.out.println();

    String[] strArr = new String[6];
    strArr[0] = "Hello";
    strArr[1] = "World";
    strArr[2] = "!";
    strArr[3] = "This";
    strArr[4] = "is";
    for(int i = 0; i < strArr.length; i++){
      System.out.println("Index-" + i + ": " + strArr[i]);
    }

    System.out.println();

    String[] sent = {"Hello,", "this", "is", "Samarth", "Jain", "here." };
    for(String word: sent){
      System.out.print(word + " ");
    }
  }
}