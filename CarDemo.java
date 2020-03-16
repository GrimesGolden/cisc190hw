public class CarDemo
{
   public static void main(String[] args)
   {
   
      Car ford = new Car("mustang", 200, 8); // Create instance of car class.
      
      ford.setName("focus"); // Call all the setter methods.
      ford.setSpeed(180.0); // Assign new values to all instance variables.
      ford.setCylinders(6);
      
      String name = ford.getName(); // Call all the getter methods of object.
      double speed = ford.getSpeed();
      int cylinders = ford.getCylinders();
      
      System.out.println(name); // And print the result they return.
      System.out.println(speed);
      System.out.println(cylinders);
      
      
   }
}