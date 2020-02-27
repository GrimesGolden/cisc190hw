import java.util.Scanner; // Needed for scanner class.
import java.io.*; // Needed for file handling.

public class FileDemo
{
   public static void main(String[] args) throws IOException
   
   {
      File file = new File("test.txt");
      Scanner inputFile = new Scanner(file); //Creates read file object.
      PrintWriter outputFile = new PrintWriter("CapsTest.txt"); //Creates write file.
     
      
      while (inputFile.hasNext())
      {
         // Read a string from the file.
         String fileString = inputFile.nextLine();
         String newString = fileString.toUpperCase();
         // Print string to new file.
         outputFile.println(newString);
       }
       
       inputFile.close();
       outputFile.close();
 }
}