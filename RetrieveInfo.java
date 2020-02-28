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
      int flag = 0; // Will check if employee was found. 
      
      System.out.println("Retrieving data - Please enter the employees " +
      "first name:"); // Retrieving employees first name 
      String firstName = kb.nextLine(); // Employees first name saved to string.
      while(employeeFile.hasNext())
      {
         
         String employeeLine = employeeFile.nextLine(); // Read the next line.
         if (employeeLine.equals(firstName)) // This reads every line. needs to just find first name. 
         {
          System.out.println("Employee found. Processing data.");
          System.out.println("First Name: " + firstName);
          System.out.println("Last Name: " + employeeFile.nextLine());
          System.out.println("Employee Id: " + employeeFile.nextLine());
          System.out.println("Years of Exp: " + employeeFile.nextLine());
          flag = 1;
          break;
         } 
      }
      
      employeeFile.close();
      
      if(flag == 0)// Checks to see if employee was found. print tailored message.
      {
         System.out.println("Employee not found");
      }
      
      System.out.println("Reached end of file: Exiting");
      
      
   }
}