public class Car
{
   private String name; // Declaring instance variables.
   private double max_speed;
   private int number_of_cylinders;
   
   /*
      Constructor
      @param n The name of the car.
      @param speed The max_speed of the car.
      @param numb The number_of_cylinders on the car.
   */
   
   public Car(String n, double speed, int numb)
   {
      name = n;
      max_speed = speed;
      number_of_cylinders = numb;
   }
   
   public void setName(String text) // Setter for name variable.
   {
      name = text;
   }
   
   public void setSpeed(double speed) // Setter for max_speed variable.
   {
      max_speed = speed;
   }
   
   public void setCylinders(int numb) // Setter for number_of_cylinders.
   {
      number_of_cylinders = numb;
   }
   
   public String getName() // Returns name variable.
   {
      return name;
   }
   
   public double getSpeed() // Return max_speed variable.
   {
      return max_speed;
   }
   
   public int getCylinders() // Return cylinder variable.
   {
      return number_of_cylinders;
   }
}