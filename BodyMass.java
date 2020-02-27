import java.util.Scanner;

public class BodyMass
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      double weight;
      double height;
      System.out.println("Please enter weight in lbs: ");
      weight = keyboard.nextDouble();
      System.out.println("Please enter height in inches: ");
      height = keyboard.nextDouble();
      double bmi = weight * 703 / (height * height);
      System.out.printf("BMI is " + "%.2f\n", bmi);
      
      if (bmi > 25) {
         System.out.println("Damn your fat as fuck");
      }
      
      if (bmi < 25 && bmi > 18.5) {
         System.out.println("This is a healthy BMI");
      }
      
      else if (bmi < 18.5) {
         System.out.println("Eat some food bitch");
      }
   }
}
      
      
   