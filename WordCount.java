import javax.swing.JOptionPane;

public class WordCount
{
	public static void main(String[] args)
	{
		String input; // Holds input

		String sentence; // Holds character

		input = JOptionPane.showInputDialog("Enter" + 
			" a sentence to obtain word count.");

		sentence = input;

		System.out.println(WordCount.wordCount(sentence));

	}

	public static int wordCount(String sentence)
	{
		String[] tokens = sentence.split(" ");
		int count = 0;
		for (String s : tokens)
			count += 1;
		return count;
	}
}