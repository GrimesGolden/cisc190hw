import java.util.ArrayList; //import array list functionality.
import java.util.Random; //import the random function. 

public class ArrayTest
{
   public static void main(String[] args)
   {
   
      ArrayList<Integer> al = new ArrayList<Integer>(); // Intialize new array list named al.
      
      Random randInst = new Random(); // Initialize new Random instance named randInst.
      
      for (int i = 0; i < 5; i++) 
      // Loop 5 times, each loop adds random integer between 1 and 100 to al.
      {
         al.add(randInst.nextInt(100));
      }
      
      for (int i : al)
      // Loop through al to print it's contents. 
      {
         System.out.println(i);
      }
      
      int removed = al.remove(0); // Remove int at index 0. Save to variable 'removed'.   
      
      
      System.out.println("Removed integer " + removed + " at index 0."); // Print removed information. 
      
      System.out.println("Size of array list is currently: " + al.size()); // Print size of al.
      
      System.out.println(""); // Print whitespace for improved aesthetic. 
      
      for (int i : al)
      // Again loop through al to print it's contents. 
      {
         System.out.println(i);
      }
      
       
   }
}