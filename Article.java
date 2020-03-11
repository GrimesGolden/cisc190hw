import java.util.Scanner;

public class Article
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in); // Create scanner.
      System.out.println("Please enter a noun: "); // Requests users input.
      String noun = kb.nextLine(); // Save user input to variable 'noun'.
      String value = getArticle(noun); // Call getArticle with noun passed as argument. Saves to variable 'value'.
      System.out.println(value + " " + noun); // Print value followed by noun.
   }
   
   public static String getArticle(String word)
   {
      word = word.toLowerCase(); // Turn word lowercase to streamline logic.
      char letter = word.charAt(0); // Save first character of word to variable 'letter'.
      switch (letter) // If vowel, fall through to case "u" and return message.
      {
         case 'a':
         case 'e': 
         case 'i':
         case 'o': 
         case 'u': return("an"); 
                 
         default: return("a"); // Else return "a".
                     
      }
      
   }
}