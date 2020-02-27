import java.util.Scanner; // Needed for scanner class.
import java.io.*; // Needed for file handling.

public class StoreInfo
{
   public static void main(String[] args) throws IOException
   {  
      Scanner kb = new Scanner(System.in); // Creating scanner object.
      FileWriter fw = new FileWriter("Employee.txt", true);  // Creates employee file writer.
      PrintWriter employeeInfo = new PrintWriter(fw); //Creates write file.
      System.out.println("How many employees would you like to enter?: " );
      
      int employeeNumb =  kb.nextInt(); // Collecting number of employees to enter.
      kb.nextLine(); //Consume new line
      
      for (int i = 1; i <= employeeNumb; i++) // Collect data according to number of employees. 
      {
         System.out.println("Enter employees number " + i + ": First name ");
         String firstName = kb.nextLine();
         employeeInfo.println(firstName);
         
         System.out.println("Enter employee number " + i + ": Last name ");
         String lastName = kb.nextLine();
         employeeInfo.println(lastName);
        
         System.out.println("Enter employee number " + i + ": Employee ID ");
         String employeeId = kb.nextLine();
         employeeInfo.println(employeeId);
         
         System.out.println("Enter employee number " + i + ": Years of Experience ");
         String yearsExp = kb.nextLine();
         employeeInfo.println(yearsExp);
         employeeInfo.println(""); // Adding new line after each entry.
      }
      
      employeeInfo.close();
      System.out.println("Data written to the program.");
      
      
      
   }
}