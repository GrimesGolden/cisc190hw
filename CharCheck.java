import java.util.Scanner; // Needed for scanner class.
import java.io.*; // Needed for file handling.

public class CharCheck
{
   public static void main(String[] args) throws IOException
   {
      File file = new File("simplefile.txt"); // Creaating base text file object.
      Scanner simpleFile = new Scanner(file); // Creating scanner to read from file.
      Scanner kb = new Scanner(System.in); // Scanner to read user input.
      int count = 0;
      
      System.out.println("Enter a char to search for in file: ");
      char searchVar = kb.next().charAt(0); // Users char to search in file.
      
      while (simpleFile.hasNext()) // Until we reach the end of the file...
      {
         String line = simpleFile.nextLine();
         
         for (int i = 0; i < line.length(); i++) // Search each line for matching char.
         {
            if (line.charAt(i) == searchVar) // If char matches add one to count.
            {
               count++;
            }
         }
      }
      
       simpleFile.close(); // Close file 
       System.out.println(count); // Print count. 
         
   }
}