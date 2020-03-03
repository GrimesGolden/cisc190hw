import java.util.Scanner;

public class Quiz
{
   public static void main(String[] args)
   // Recieves an integer from user. If <= 0 and < 100 assigns true.
   // Otherwise assigns false.
   
   {
      int number; // Number to determine.
      boolean logic; // True or false logic
      Scanner kb = new Scanner(System.in); // Scanner to accept input. 
      
      System.out.println("Please enter an integer: "); // Querying user for input. 
      number = kb.nextInt(); // Accepting input and storing in number variable.
      
      if (number >= 0 && number < 100)
      {
         logic = true;
      }
      else
      {
         logic = false;
      }
      
      System.out.println("integer: " + number);
      System.out.println("true or false: " + logic);
   }
}