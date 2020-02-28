import java.util.Scanner; //Needed for Scanner class.
import java.io.*; //Needed for File and IOException.

public class RetrieveInfo
// Reads info from employee.txt. 
{
   public static void main(String[] args) throws IOException
   {  
      Scanner kb = new Scanner(System.in); // Creating scanner class to read keyboard input
      File file = new File("Employee.txt"); // Creating employee.txt file class.
      Scanner employeeFile = new Scanner(file); // Creating scanner to read from employee.txt 
      
      System.out.println("Retrieving data - Please enter the employees " +
      "first name:"); // Retrieving employees first name 
      String firstName = kb.nextLine(); // Employees first name saved to string.
      while(employeeFile.hasNext())
      {
         
         String employeeLine = employeeFile.nextLine(); // Read the next line.
         if (employeeLine.equals(firstName))
         {
          System.out.println("Employee found. Processing data.");
          System.out.println("First Name: " + firstName);
          System.out.println("Last Name: " + employeeFile.nextLine());
          System.out.println("Employee Id: " + employeeFile.nextLine());
          System.out.println("Years of Exp: " + employeeFile.nextLine());
          break;
         } 
      }
      
      employeeFile.close();
      System.out.println("Reached end of file: Exiting");
      
      
   }
}