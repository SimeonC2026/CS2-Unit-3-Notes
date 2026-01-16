public class Main {

   public static void main(String []args) {

      // Create a new String -> SHORTCUT!
      String st = "Hello World";
      // But Strings are actually OBJECTS
      // The original way to create a String:
      String steph = new String("HELLO WORLD");

      // All objects can be created using this pattern:
      // ClassName objectName = new ClassName();
      BuildABear basicBear = new BuildABear();
      // "BuildABear basicBear" is DECLARING a variable of type BuildABear
      // "new BuildABear()" is CALLING a CONSTRUCTOR to set up the object

      // Look at our new object
      System.out.println(basicBear);
      
      // Create a new object with our own values
      // called the CONSTRUCTOR: ClassName(String, String, int)
      BuildABear puppy = new BuildABear("dog", "Henry", 90);

      // Printing an OBJECT calls the CLASS' toString() method
      System.out.println(puppy);
      
      // Test our methods below by CALLING them on an object instance
      // GETTERS are NON-VOID (we need to handle output data)
      System.out.println( puppy.getType() );
      // or, store the return value in a variable
      double price = puppy.getPrice();
      System.out.println( price );

      // SETTERS are VOID (means no return value)
      // Calling void methods: objectName.methodName();
      puppy.setName("Leo");
      puppy.setFillLevel(50);
      // setters (mutators) changed values. let's see the effects:
      System.out.println(puppy);

      // STATIC variables & methods belong to a CLASS
      // get CALLED using the Class name, NOT an object
      BuildABear.showStore();
      // we've used static methods from the Math class!!!
      double randNum = Math.random();
      // NOTE: the main method is STATIC bc there is
      // ONLY ONE COPY of it per program! 



   } // end main() METHOD
} // end Main CLASS
