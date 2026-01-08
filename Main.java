public class Main {

   public static void main(String []args) {

      // Create a new String -> SHORTCUT!
      String st = "Hello World";
      // But Strings are actually OBJECTS
      // The original way to create a String:
      String steph = new String("HELLO WORLD");

      // All objects can be created using this pattern:
      // ClassName objectName = new ClassName();
      BuildABear puppy = new BuildABear();
      // "BuildABear puppy" is DECLARING a variable of type BuildABear
      // "new BuildABear()" is CALLING a CONSTRUCTOR to set up the object

      // Look at our new object
      System.out.println(puppy);
      

   }
}
