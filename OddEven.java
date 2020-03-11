import java.util.Scanner;

public class OddEven
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in); // Creates scanner variable.
      System.out.println("Please enter an integer: "); // Prints integer request message.
      int i = kb.nextInt(); // Recieves int from keyboard.
      System.out.print(i + " "); // Prints integer.
      boolean truefalse = theNumberIsEven(i); //Calls theNumberIsEven method with integer as argument. Saves to variable.
      
      if(truefalse == true) // If value returned true, print message.
      {
         System.out.print("is Even");
      }  
      
      else
      {
         System.out.print("is Odd"); // Otherwise prints "is Odd".
      }
   }
   
   public static boolean theNumberIsEven(int i)
   {
      int numb = i % 2; // Check if integer is odd/even.
      
      if (numb != 0) // If not even return false.
      {
         return false;
      }
      
      else // Else return true. 
      {
         return true;
      }
   }
}