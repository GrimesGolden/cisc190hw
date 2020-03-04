import java.util.Scanner; //Needed for Scanner class.
import java.io.*; //Needed for File and IOException.

public class RetrieveInfo
// Reads info from employee.txt. 
{
   public static void main(String[] args) throws IOException
   {  
      Scanner kb = new Scanner(System.in); // Creating scanner class to read keyboard input
      File file = new File("Employee.txt"); // Creating employee.txt file.
      Scanner employeeFile = new Scanner(file); // Creating scanner to read from employee.txt file. 
      int flag = 0; // Will check if employee was found. 
      
      System.out.println("Retrieving data - Please enter the employees " +
      "first name:"); // Retrieving employees first name 
      String nameSearch = kb.nextLine(); // Employees first name saved to variable nameSearch.
      while (employeeFile.hasNext()) // Continue as long as there are file entries.
      {
         String firstName = employeeFile.nextLine(); // Save first name to variable.
         String lastName = employeeFile.nextLine(); // Save last name to variable.
         String employeeId = employeeFile.nextLine(); // Save employee ID to variable.
         String yearsExp = employeeFile.nextLine(); // Save years experience to variable.
         
         if (firstName.equals(nameSearch)) // If searched name matches first name then...
         {
          System.out.println("Employee found. Processing data."); // Print all data
          System.out.println("First Name: " + nameSearch);
          System.out.println("Last Name: " + lastName);
          System.out.println("Employee Id: " + employeeId);
          System.out.println("Years of Exp: " + yearsExp);
          flag = 1; // Increment flag counter. 
          break;
         } 
      }
      
      employeeFile.close(); // Close file.
      
      if(flag == 0)// If employee was not found flag will still be at zero.
      {
         System.out.println("No Employee was Found"); // Therefore print message. 
      }
      
      System.out.println("Reached end of file: Exiting"); // While loop broke due to end of file.   
      
   }
}