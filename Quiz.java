import java.util.Scanner;

public class Quiz
{
   public static void main(String[] args)
   // Main method recieves an integer from user. If >= 0 and < 100 assigns true.
   // Otherwise assigns false.
   
   {
      int number; // Declaring integer variable.
      boolean logic; // Declaring boolean variable
      Scanner kb = new Scanner(System.in); // Scanner to accept input. 
      
      try // This try catch block will catch non-integer input. 
      {
         System.out.println("Please enter an integer: "); // Querying user for input. 
         number = kb.nextInt(); // Storing input in number variable 
     
         if (number >= 0 && number < 100) // Performing logic steps. 
         {
            logic = true; 
         }
         else
         {
            logic = false;
         }
      
         System.out.println("integer: " + number); // Print integer on one line.
         System.out.println("true or false: " + logic); // Print boolean on one line.
      }
      
      catch (java.util.InputMismatchException e) // Will execute if user enters non-integer.
      {
         System.out.println("Error: Please enter only whole integers");
      }
      
   }
}